package jpa.ancile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@SequenceGenerator(name="emp_seq", initialValue=100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="emp_seq")
	private int empID;
	private String empName;
	private String empAddress;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	
}