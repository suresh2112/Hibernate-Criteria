package com.createiq.employee.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class DeleteEmployee {
	public static void main(String[] args) {
		
		
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory  sessionFactory=configuration.buildSessionFactory();
Session session=sessionFactory.openSession();

String dlete_query="delete from Employee where ename='c'";
session.beginTransaction();
Query query=session.createQuery(dlete_query);
//query.setParameter(1, "venenla");
query.executeUpdate();
session.getTransaction().commit();
session.close();
		
	}

}
