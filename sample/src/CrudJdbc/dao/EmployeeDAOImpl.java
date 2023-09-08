package CrudJdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CrudJdbc.bean.Employee;
import CrudJdbc.util.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAOI {
	public static Connection con = null;
	public static PreparedStatement pst = null;

	@Override
	public boolean insertEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// System.out.println("DAO class");
		int empId = e.getEmpId();
		String empName = e.getEmpName();
		String empAddress = e.getEmpAddress();
		double empSalary = e.getEmpSalary();
		boolean result = isEmpIDAlreadyExists(empId);
		if (result) {
			System.out.println("EmpID already Exists...Please try again");
			return false;
		} else {
			con = DBUtility.getDBConnection();
			pst = con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setString(3, empAddress);
			pst.setDouble(4, empSalary);

			pst.executeUpdate();
			con.close();
			System.out.println("Employee Values inserted");
			return true;
		}
	}

	@Override
	public boolean readEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtility.getDBConnection();
		boolean result = isEmpIDAlreadyExists(e.getEmpId());
		if (!result) {
			System.out.println("Please enter a valid empID");
			return false;
		} else {
			pst = con.prepareStatement("select * from employee where empId=?");
			pst.setInt(1, e.getEmpId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
			}
			return true;
		}

	}

	@Override
	public boolean updateEmployee(Employee e, int colVal) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtility.getDBConnection();
		if (!isEmpIDAlreadyExists(e.getEmpId())) {
			System.out.println("Please enter valid EmpID..");
		} else {
			if (colVal == 1) {
				pst = con.prepareStatement("update employee set empName=? where empId=?");
				pst.setString(1,e.getEmpName());
				pst.setInt(2,e.getEmpId());
				pst.executeUpdate();
			}
			else if(colVal == 2) {
				pst = con.prepareStatement("update employee set empAddress=? where empId=?");
				pst.setString(1,e.getEmpAddress());
				pst.setInt(2,e.getEmpId());
				pst.executeUpdate();
			}
			else {
				pst = con.prepareStatement("update employee set empSalary=? where empId=?");
				pst.setDouble(1,e.getEmpSalary());
				pst.setInt(2,e.getEmpId());
				pst.executeUpdate();
			}
			System.out.println("Values Updated sucessfully...");
			return true;
		}
		return false;
	}

	@Override
	public void deleteEmployee(Employee e) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtility.getDBConnection();
		if (!isEmpIDAlreadyExists(e.getEmpId())) {
			System.out.println("Please enter valid EmpID..");
		} else {
		pst = con.prepareStatement("delete from employee where empId=?");
		pst.setInt(1, e.getEmpId());
		pst.executeUpdate();
		System.out.println("Employee record deleted successfully..");
		}
	}

	public boolean isEmpIDAlreadyExists(int empId) throws ClassNotFoundException, SQLException {
		con = DBUtility.getDBConnection();
		pst = con.prepareStatement("Select * from employee where empId=?");
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int count = rs.getInt(1);
			return count > 0;
		}

		return false;
	}

}
