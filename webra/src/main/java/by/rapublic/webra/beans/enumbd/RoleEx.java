package by.rapublic.webra.beans.enumbd;

import javax.persistence.*;

import by.rapublic.webra.beans.Role;


@Entity
@Table(name = "role")
@SequenceGenerator(name = "entityIdGenerator", sequenceName = "role_id")
@MappedEnum(enumClass = Role.class)
public class RoleEx extends SystemDictionary{
	
}
