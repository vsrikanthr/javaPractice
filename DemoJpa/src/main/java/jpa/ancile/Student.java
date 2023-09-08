package jpa.ancile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	private String stuName;
	private String stuAddress;
	
	public Student() {
		super();
	}
	public Student(int stdId, String stuName, String stuAddress) {
		super();
		this.stdId = stdId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}
	public Student(String stuName, String stuAddress) {
		super();
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + 
				 "]";
	}
	
	
	
}