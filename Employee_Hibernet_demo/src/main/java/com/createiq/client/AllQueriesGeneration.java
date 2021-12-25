package com.createiq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.employee.mode.Employee;



public class AllQueriesGeneration {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		org.hibernate.SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		System.out.println("ALL EMPLOYEES DATA IS HERE....................");
		String Select_all_query="from Employee";
		Query query=session.createQuery(Select_all_query);
		List<Employee> employees=query.list();
		employees.forEach(System.out::println);
		
		System.out.println("SELECT EID AND ENAME FROM EMPLOYEE");
		System.out.println();
	String Select_eid_ename="select eid,ename from Employee";
	Query query2=session.createQuery(Select_eid_ename);
	List<Object[]> empList=query2.list();
	empList.forEach(array->{
		System.out.println(array[0]+"    "+array[1]);
	}
			
			
			);
	
	
	System.out.println("select ename from employee");
	String Select_Ename_query="select ename from Employee";
	Query query3=session.createQuery(Select_Ename_query);
	List<String> list=query3.list();
	list.forEach(System.out::println);
		
	String Select_Eid_query="select eid from Employee";
	Query query4=session.createQuery(Select_Eid_query);
	List<Integer> eidlist=query4.list();
	eidlist.forEach(System.out::println);
		
		session.beginTransaction().commit();
		
		
		String Delete_Query="delete from Employee where eid='1001'";
		session.beginTransaction();
		Query query5=session.createQuery(Delete_Query);
//		query5.setParameter(position, value)
		query5.executeUpdate();
		System.out.println("successfully----------------");
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	
	

}
