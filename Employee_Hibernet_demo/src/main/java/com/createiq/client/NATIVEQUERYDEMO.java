package com.createiq.client;

import java.util.List;import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import com.createiq.employee.mode.Employee;



public class NATIVEQUERYDEMO {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		org.hibernate.SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		System.out.println("ALL EMPLOYEES DATA IS HERE....................");
	
			NativeQuery<Object[]> ALL=session.createNativeQuery("select * from EMP_TAB");
			List<Object[]> emps=ALL.list();
		for (Object[] objects : emps) {
			System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
		}
		NativeQuery<Object[]> empename=session.createNativeQuery("select emp_id,emp_name from EMP_TAB");
		List<Object[]> eid_ename=empename.list();
		for (Object[] objects : emps) {
			System.out.println(objects[0]+" "+objects[1]);
	
	
	}
		NativeQuery<Object[]>empname_empsal=session.createNativeQuery("select emp_name,emp_sal from EMP_TAB");
		List<Object[]> empss=empname_empsal.list();
		for (Object[] objects : empss) {
			System.out.println(objects[0]+" "+objects[1]);
		}
NativeQuery<Integer>count=session.createNativeQuery("select count(*)from EMP_TAB");
List<Integer>integers=count.getResultList();
System.out.println(integers+".....................................");
System.out.println("id and salary");
List<Object[]> singleline=session.createNativeQuery("select emp_id,emp_sal from EMP_TAB").list();
for (Object[] objects : empss) {
	System.out.println(objects[0]+" "+objects[1]);
}

NativeQuery<Integer>eidis=session.createNativeQuery("select emp_id from EMP_TAB");
List<Integer>list=eidis.list();
for (Integer integer : list) {
	System.out.println(integer);
	
}
NativeQuery<Object[]>nativeQuery=session.createNativeQuery("select emp_id,emp_sal from EMP_TAB");
List<Object[]> l=nativeQuery.list();
for (Object[] objects : l) {
	System.out.println(objects[0]+" "+objects[1]);
}
List<Object[]>nativeQuery2=(List<Object[]>) session.createNativeQuery("select * from EMP_TAB").addScalar("emp_id",IntegerType.INSTANCE).addScalar("emp_name",StringType.INSTANCE).list();
for (Object[] objects : l) {
	System.out.println(objects[0]+"   "+objects[1]);
}
List<Employee>employees=(List<Employee>) session.createNativeQuery("select * from EMP_TAB",Employee.class).list();	
employees.forEach(System.out::println);
	
	}
	}
