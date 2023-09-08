package CrudJdbc.ui;
import java.sql.SQLException;
import java.util.*;

import CrudJdbc.bean.*;
import CrudJdbc.dao.*;
import CrudJdbc.service.*;

public class UITester {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose any option from below operations");
			printStatements();
			int option = sc.nextInt();
			switch (option) {
			case 1:
				insertEmployee();
				break;
			case 2:
				readEmployee();
				break;
			case 3:
				updateEmployee();
				break;
			case 4:
				deleteEmployee();
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to perform another operation? (1 = Yes, 0 = No)");
			int continueOption = sc.nextInt();
			if (continueOption == 0) {
				System.out.println("Exiting program.");
				break;
			}
		}

	}

	public static void insertEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceI eService = new EmployeeServiceImpl();
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID");
		int empId = sc.nextInt();
		employee.setEmpId(empId);
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		employee.setEmpName(empName);
		System.out.println("Enter Employee Address");
		String empAddr = sc.nextLine();
		employee.setEmpAddress(empAddr);
		System.out.println("Enter Employee Salary");
		double empSal = sc.nextDouble();
		sc.nextLine();
		employee.setEmpSalary(empSal);
		//System.out.println("Operation sucessful");
		boolean result = eService.insertEmployee(employee);
		if(result) {
			System.out.println("Insert Operation successful");
		}
		else {
			System.out.println("Insert Operation failed..!");
		}
	}

	public static void readEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceI eService = new EmployeeServiceImpl();
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int choice = sc.nextInt();
		//employee.setEmpID(choice);
		employee.getEmpId();
//		employee.getEmpID();
		employee.getEmpName();
		employee.getEmpAddress();
		employee.getEmpSalary();
		if(eService.readEmployee(employee)) {
			System.out.println("Read operation successfull");
		}
		else {
			System.out.println("Read Operation Failed..!");
		}
	}

	public static void updateEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceI eService = new EmployeeServiceImpl();
		EmployeeDAOImpl eDAO = new EmployeeDAOImpl();
		Employee employee = new Employee();
		System.out.println("Enter the empId you want to update");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		boolean result = eDAO.isEmpIDAlreadyExists(choice);
		if(result) {
			System.out.println("Please enter which data you want to update :\n 1. Name, 2. Address, 3. Salary");
			int upChoice = sc.nextInt();
			if(upChoice == 1) {
				System.out.println("Enter new Name value");
				String newName = sc.nextLine();
				employee.setEmpName(newName);
				employee.setEmpId(choice);
			}else if(upChoice == 2) {
				System.out.println("Enter new Address value");
				String newAddr = sc.nextLine();
				employee.setEmpAddress(newAddr);
				employee.setEmpId(choice);
			}
			else {
				System.out.println("Enter new Salary value");
				sc.nextLine();
				double newSal = sc.nextDouble();
				employee.setEmpSalary(newSal);
				employee.setEmpId(choice);
			}
			eService.updateEmployee(employee, upChoice);
		}
	}

	public static void deleteEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceI eService = new EmployeeServiceImpl();
		EmployeeDAOImpl eDAO = new EmployeeDAOImpl();
		Employee employee = new Employee();
		System.out.println("Please enter the EmpID to delete: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		employee.setEmpId(choice);
			eService.deleteEmployee(employee);
		
	}

	public static void printStatements() {
		System.out.println("EMPLOYEE CRUD OPERATION");
		System.out.println("1. Insert Employee");
		System.out.println("2. Read Employee Data");
		System.out.println("3. Update Employee Data");
		System.out.println("4. Delete Employee");
	}
		
	}


