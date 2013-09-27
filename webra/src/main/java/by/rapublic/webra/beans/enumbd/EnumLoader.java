package by.rapublic.webra.beans.enumbd;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import net.sf.hibernate.cfg.Configuration;

import org.hibernate.mapping.PersistentClass;

import com.mysql.jdbc.Field;

import by.rapublic.webra.beans.enumbd.enuminterface.SessionAction;

public class EnumLoader implements SessionAction{

	@Override
	public void run(Session session) throws Exception {
		Configuration configuration = new Configuration();
		Iterator<PersistentClass> mappingList = configuration.getClassMappings();
		while (mappingList.hasNext()) {
			PersistentClass mapping = mappingList.next();

			Class<?> clazz = mapping.getMappedClass();
			if (!SystemDictionary.class.isAssignableFrom(clazz))
				continue;
			if (!clazz.isAnnotationPresent(MappedEnum.class))
				continue;

			MappedEnum mappedEnum = clazz.getAnnotation(MappedEnum.class);
			updateEnumIdentifiers(session, mappedEnum.enumClass(), (Class<SystemDictionary>) clazz);
		}

	}

	private void updateEnumIdentifiers(
			Session session,
			Class<? extends Enum> enumClass,
			Class<? extends SystemDictionary> entityClass) throws Exception {
		List<SystemDictionary> valueList =
				(List<SystemDictionary>) session.createCriteria(entityClass).list();

		int maxId = 0;
		Enum[] constants = enumClass.getEnumConstants();
		Iterator<SystemDictionary> valueIterator = valueList.iterator();
		while (valueIterator.hasNext()) {
			SystemDictionary value = valueIterator.next();

			int valueId = value.getId().intValue();
			setEnumOrdinal(Enum.valueOf(enumClass, value.getCode()), valueId);
			if (valueId > maxId)
				maxId = valueId;
		}

		Object valuesArray = Array.newInstance(enumClass, maxId + 1);
		for (Enum value : constants)
			Array.set(valuesArray, value.ordinal(), value);

		java.lang.reflect.Field field;
		try {
			field = enumClass.getDeclaredField("$VALUES");
			field.setAccessible(true);

			java.lang.reflect.Field modifiersField = Field.class.getDeclaredField("modifiers");
			modifiersField.setAccessible(true);
			modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

			field.set(null, valuesArray);
		} catch (Exception ex) {
			throw new Exception("Can't update values array: ", ex);
		}
	}

	private void setEnumOrdinal(Enum object, int ordinal) throws Exception {
		java.lang.reflect.Field field;
		try {
			field = object.getClass().getSuperclass().getDeclaredField("ordinal");
			field.setAccessible(true);
			field.set(object, ordinal);
		} catch (Exception ex) {
			throw new Exception("Can't update enum ordinal: " + ex);
		}
	}

}
