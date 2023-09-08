package CrudJdbc.service;

import java.sql.SQLException;

import CrudJdbc.bean.Employee;
import CrudJdbc.dao.*;

public class EmployeeServiceImpl implements EmployeeServiceI {
	@Override
	public boolean insertEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOI empDAO = new EmployeeDAOImpl();
		
		//System.out.println("From Service Layer");
		if(empDAO.insertEmployee(e)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean readEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOI empDAO = new EmployeeDAOImpl();
		if(empDAO.readEmployee(e)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e, int colVal) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOI eDAO = new EmployeeDAOImpl();
		eDAO.updateEmployee(e,colVal);
		return false;
	}

	@Override
	public void deleteEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOI eDAO =new EmployeeDAOImpl();
		eDAO.deleteEmployee(e);
	}
}
