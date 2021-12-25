package com.createiq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;



public class NamedQueriesSession {

	public static void main(String[] args) {
		
		
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		List<Object[]> total_emp=session.createNamedQuery("get_all_employees").list();
		total_emp.forEach(arr->{
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		});
		
		List<Object[]> count=session.createNamedQuery("COUNT_QUERY").getResultList();
		System.out.println(" count is started................."+count);
		
		
		
		List<Integer> list=session.createNamedQuery("GET_BY_ID").list();
		list.forEach(System.out::println);
		
		
		List<String>list2=session.createNamedQuery("FIND_NAME").list();
		list2.forEach(System.out::println);
		System.out.println("....................................");
		List<Object[]>list3=session.createNamedQuery("FIND_BY_ID").setParameter(1, "emp_id").list();
		list2.forEach(System.out::println);
		System.out.println("..........................");
		List<String>list4=session.createNamedQuery("like").list();
		list4.forEach(System.out::println);
	
		
	}


}
