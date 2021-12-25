package com.createiq.client;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.employee.mode.Employee;

public class InsertEmployee {
	public  static final int a=10;
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		org.hibernate.SessionFactory sessionFactory=configuration.buildSessionFactory();

		Session session=sessionFactory.openSession();
//		Employee employee=new Employee();
//		employee.setEid(33);
//		employee.setEname("vennela_goud_123");
//		employee.setEsal(454000);
//		session.merge(employee);
//		
//		session.beginTransaction().commit();
////		session.close();
//		System.out.println(session.get(Employee.class, 30));
//		System.out.println(session.get(Employee.class, 31));
//		System.out.println(session.load(Employee.class, 30));
//		System.out.println(session.load(Employee.class, 30));
System.out.println(session.load(Employee.class, 37));
		Employee employee=new Employee();
//		employee.setEid(37);
		employee.setEname("shtakshi_goud_pujari");
		employee.setEsal(90000);
//		Serializable id=session.save(employee);
//		System.out.println(id+"--serializable is");
//		session.saveOrUpdate(employee);
//		session.beginTransaction().commit();
//		System.out.println(session.isConnected());
//		session.close();
//		System.out.println(session.isConnected());
		Query<Employee> query=session.createQuery("from Employee");
		List<Employee> employees=query.list();
	employees.forEach(System.out::println);
//	
//	Query<Employee> query2=session.createQuery("select ename,eid from Employee");
//List<Object[]> list=query2.list();
	System.out.println("...............................");
	String Select_All_Query="from Employee";
	Query query2=session.createQuery(Select_All_Query);
	List<Employee>employees2=query2.list();
	employees2.forEach(System.out::println);
	System.out.println("Name AND SALARY");
	System.out.println();
	System.out.println();
	String  Select_ename_esal="select ename,esal from Employee";
	Query query3=session.createQuery(Select_ename_esal);
	
	List<Object[]> empList=query3.list();
	empList.forEach(array->{
			
			System.out.println(array[0]+"     "+array[1]);
	}
			);
	
	System.out.println("EID BASED");
String Select_eid="select eid from Employee";
Query query4=session.createQuery(Select_eid);
List<Integer> eids=query4.list();
eids.forEach(System.out::println);
	
System.out.println("name based");
String Select_name="select ename from Employee";
Query query5=session.createQuery(Select_name);
List<String> listnames=query5.list();
listnames.forEach(System.out::println);


System.out.println();


System.out.println("salary based................");
String Select_salary="select esal from Employee";
Query query6=session.createQuery(Select_salary);
List<Double> esalaryDoubles=query6.list();
esalaryDoubles.forEach(System.out::println);
	



	
	
session.beginTransaction().commit();
session.close();

	
	
	
		
		
}
}