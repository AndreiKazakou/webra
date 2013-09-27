package by.rapublic.webra.beans.enumbd;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MappedEnum {
	Class<? extends Enum> enumClass();
}
