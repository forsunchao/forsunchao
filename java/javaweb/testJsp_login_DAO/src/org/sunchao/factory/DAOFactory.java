package org.sunchao.factory;

import org.sunchao.DAO.PersonDao;
import org.sunchao.DAOImpl.PersonDaoImpl;

public class DAOFactory {
	public static PersonDao getPersonDAOInstance() {
		return new PersonDaoImpl();
	}
}
