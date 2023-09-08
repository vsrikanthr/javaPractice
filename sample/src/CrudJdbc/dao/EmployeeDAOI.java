package CrudJdbc.dao;

import java.sql.SQLException;

import CrudJdbc.bean.Employee;

public interface EmployeeDAOI {
	public boolean insertEmployee(Employee e) throws ClassNotFoundException, SQLException;
	
	public boolean readEmployee(Employee e) throws ClassNotFoundException, SQLException;
	
	public boolean updateEmployee(Employee e, int colVal)throws ClassNotFoundException, SQLException;
	
	public void deleteEmployee(Employee e) throws ClassNotFoundException, SQLException;

}
