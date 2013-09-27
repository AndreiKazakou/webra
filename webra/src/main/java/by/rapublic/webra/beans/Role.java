package by.rapublic.webra.beans;

import javax.persistence.EnumType;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
@Entity
@Table(name="ROLE")
public enum Role {
	ADMINISTRATOR,USER
}
