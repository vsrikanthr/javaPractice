package jpa.ancile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import javax.persistence.*;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import javax.persistence.*;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager emanager = emfactory.createEntityManager();
		Student st = new Student();
		Employee e = new Employee();
//    	st.setStdId(101);
//    	st.setStuName("Mahesh");
//    	st.setStuAddress("USA");
//    	emanager.getTransaction().begin();
//    	emanager.persist(st);
//    	emanager.getTransaction().commit();

		Scanner sc = new Scanner(System.in);
		int caseOption;
		while (true) {
			printStatements();
			int crudOption = sc.nextInt();
			switch (crudOption) {
			case 1:
				System.out.println("Enter Student details to insert");
				sc.nextLine();
				System.out.println("Enter Student Name");
				String stuName = sc.nextLine();
				System.out.println("Enter Student Address");
				String stuAddr = sc.nextLine();
				st.setStuName(stuName);
				st.setStuAddress(stuAddr);
				st = new Student(stuName, stuAddr);
				emanager.getTransaction().begin();
				emanager.persist(st);
				emanager.getTransaction().commit();
				System.out.println(st);
				System.out.println("Creating Student operation is Sucessfull");
				break;

			case 2:
				System.out.println("Choose student Id to read the data");
				TypedQuery<Integer> query = emanager.createQuery("select s.stdId from Student s", Integer.class);
				List<Integer> sid = query.getResultList();
				if (sid.isEmpty()) {
					System.out.println("No records found");
				} else {
					System.out.println(sid);
				}
				int id = sc.nextInt();
				st = emanager.find(Student.class, id);
				if (st != null) {
					System.out.println("Student details are: ");
					System.out.printf("%-5s%-25s%-30s%n", "Id", "Name", "Address");
					System.out.printf("%-5d%-25s%-30s%n", st.getStdId(), st.getStuName(), st.getStuAddress());
				}
				break;
			case 3:
				System.out.println("Choose student Id to update the data");
				TypedQuery<Integer> query1 = emanager.createQuery("select s.stdId from Student s", Integer.class);
				List<Integer> sid1 = query1.getResultList();
				if (sid1.isEmpty()) {
					System.out.println("No records found");
				} else {
					System.out.println(sid1);
				}
				int id1 = sc.nextInt();
				st = emanager.find(Student.class, id1);
				if (st != null) {
					System.out.println("Student details are: ");
					System.out.printf("%-5s%-25s%-30s%n", "Id", "Name", "Address");
					System.out.printf("%-5d%-25s%-30s%n", st.getStdId(), st.getStuName(), st.getStuAddress());
				}
				System.out.println("Choose which data you want to update: \n 1.Name 2. Address");
				int input = sc.nextInt();
				System.out.println();
				sc.nextLine();
				if (input == 1) {
					System.out.println("Please enter a new name:");
					String name = sc.nextLine();
					emanager.getTransaction().begin();
					Query query2 = emanager.createQuery("update Student set stuName= :newName where stdId= :id");
					query2.setParameter("newName", name);
					query2.setParameter("id", id1);
					int upRows = query2.executeUpdate();
					st.setStuName(name);
					if (upRows > 0) {
						emanager.persist(st);
						emanager.getTransaction().commit();
						System.out.println("Name Updated sucessfuly");
					} else {
						emanager.getTransaction().rollback();
					}
				} else {
					System.out.println("Please enter a new Address:");
					String addr = sc.nextLine();
					emanager.getTransaction().begin();
					Query query2 = emanager.createQuery("update Student set stuAddress= :newAddr where stdID= :id");
					query2.setParameter("newAddr", addr);
					query2.setParameter("id", id1);
					int upRows1 = query2.executeUpdate();
					st.setStuAddress(addr);
					if (upRows1 > 0) {
						emanager.persist(st);
						emanager.getTransaction().commit();
						System.out.println("Address Updated successfuly");

					} else {
						emanager.getTransaction().rollback();
					}
				}
				break;
			case 4:
				System.out.println("Choose student Id to update the data");
				Query query2 = emanager.createQuery("select s.stdId from Student s");
				List<Integer> sid2 = query2.getResultList();
				if (sid2.isEmpty()) {
					System.out.println("No records found");
				} else {
					System.out.println(sid2);
				}
				int id2 = sc.nextInt();
				st = emanager.find(Student.class, id2);
				if (st != null) {
					System.out.println("Student details are: ");
					System.out.printf("%-5s%-25s%-30s%n", "Id", "Name", "Address");
					System.out.printf("%-5d%-25s%-30s%n", st.getStdId(), st.getStuName(), st.getStuAddress());
				}
				System.out.println("Do you want to delete the above data? (1/0)");
				int delOption = sc.nextInt();
				if (delOption == 1) {
					emanager.getTransaction().begin();
					Query query3 = emanager.createQuery("delete from Student where stdId= :id");
					query3.setParameter("id", id2);
					int upRows1 = query3.executeUpdate();
					if (upRows1 > 0) {
						emanager.getTransaction().commit();
						System.out.println("Deleted successfully..");
					} else {
						emanager.getTransaction().rollback();
					}
				} else {
					break;
				}
			}
				System.out.println("Do you want to continue? (1/0)");
				caseOption = sc.nextInt();
				if (caseOption == 0) {
					System.out.println("Exiting program.");
					break;
				}else if(caseOption == 1) {
					continue;
				}
				else {
					System.out.println("Please enter valid input (1/0)");
				}
		}
	}

	public static void printStatements() {
		System.out.println("Choose any CRUD option from below");
		System.out.println("1. Create details");
		System.out.println("2. Read details ");
		System.out.println("3. Update details");
		System.out.println("4. Delete details");
	}

}

