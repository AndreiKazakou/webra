package by.rapublic.webra.beans.enumbd.enuminterface;

import org.hibernate.Session;

public interface SessionAction {
	void run(Session session) throws Exception;
}
