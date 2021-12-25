package com.createiq.employee.Critiria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.employee.mode.Employee;
import com.mysql.cj.xdevapi.SessionFactory;

public class FindAll {
	
	public static void main(String[] args) {
		
//		Configuration configuration=new Configuration();
//		configuration.configure();
//		org.hibernate.SessionFactory sessionFactory=configuration.buildSessionFactory();
//		Session session=sessionFactory.openSession();
//		System.out.println("select from eid");
		
//		CriteriaBuilder builder=session.getCriteriaBuilder();

//		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
//		Root<Employee> root = query.from(Employee.class);
//		query.select(root).where(builder.equal(root.get("eid"), 32));
//	    Query<Employee> q=session.createQuery(query);
//        List<Employee> employees = q.list();
//		employees.forEach(System.out::println);
//		
//		CriteriaBuilder builder2=session.getCriteriaBuilder();
//		CriteriaQuery<Employee> query2=builder2.createQuery(Employee.class);
//		Root<Employee> root2=query2.from(Employee.class);
//		query2.select(root).where(builder2.equal(root.get("eid"), 32));
//		Query<Employee> q1=session.createQuery(query2);
//		List<Employee> employees2=q1.list();
//		CriteriaBuilder builder=session.getCriteriaBuilder();
//		CriteriaQuery<Employee> criteriaQuery=builder.createQuery(Employee.class);
//		Root<Employee> root=criteriaQuery.from(Employee.class);
//		criteriaQuery.select(root).where(builder.equal(root.get("eid"), 32));
//		Query<Employee> query=session.createQuery(criteriaQuery);
//		List<Employee> employees=query.list();
//
//		CriteriaBuilder builder=session.getCriteriaBuilder();
//		CriteriaQuery<Employee> criteriaQuery=builder.createQuery(Employee.class);
//		Root<Employee>root=criteriaQuery.from(Employee.class);
//		criteriaQuery.select(root);
//		Query<Employee> query=session.createQuery(criteriaQuery);
//		List<Employee> employees=query.list();
//		employees.forEach(System.out::println);
		
	Configuration configuration=new Configuration();
	configuration.configure();
 org.hibernate.SessionFactory sessionFactory=configuration.buildSessionFactory();
 Session session=sessionFactory.openSession();
 
//CriteriaBuilder builder=session.getCriteriaBuilder();
//CriteriaQuery< Employee> criteriaQuery=builder.createQuery(Employee.class);
//Root<Employee>root=criteriaQuery.from(Employee.class);
//criteriaQuery.select(root).where(builder.equal(root.get("eid"), 32));
//Query<Employee>query=session.createQuery(criteriaQuery);
//List<Employee> employees=query.list();
//employees.forEach(System.out::println);
//System.out.println();System.out.println();System.out.println();
//
//
//CriteriaBuilder builder2=session.getCriteriaBuilder();
//CriteriaQuery<Employee> criteriaQuery2=builder2.createQuery(Employee.class);
//Root<Employee>root2=criteriaQuery2.from(Employee.class);
//criteriaQuery2.select(root2);
//Query< Employee> query2=session.createQuery(criteriaQuery2);
//List<Employee>employees2=query2.list();
//employees2.forEach(System.out::println);
//
//System.out.println();
//System.out.println();
//System.out.println("..........................................");
//
//System.out.println("eid and enmae");
//
//CriteriaBuilder builder3=session.getCriteriaBuilder();
//
//CriteriaQuery<Object[]>criteriaQuery3=builder3.createQuery(Object[].class);
//Root<Employee>root3=criteriaQuery3.from(Employee.class);
//criteriaQuery3.multiselect(root3.get("eid"),root3.get("ename"));
//Query<Object[]> query3=session.createQuery(criteriaQuery3);
//List<Object[]>employees3=query3.list();
//employees3.forEach(arrays->{
//	System.out.println(arrays[0]+"   "+arrays[1]);
//});
//
//System.out.println("EID///////////////////////////////////////////////.......");
//CriteriaBuilder builder4=session.getCriteriaBuilder();
//CriteriaQuery<Integer>criteriaQuery4=builder4.createQuery(Integer.class);
//Root<Employee>root4=criteriaQuery4.from(Employee.class);
//criteriaQuery4.select(root4.get("eid"));
//Query<Integer> query4=session.createQuery(criteriaQuery4);
//List<Integer>integers=query4.list();
//integers.forEach(System.out::println);
//System.out.println("ename/////////////////................................");
//
//CriteriaBuilder builder5=session.getCriteriaBuilder();
//CriteriaQuery<String>criteriaQuery5=builder5.createQuery(String.class);
//Root<Employee> root5=criteriaQuery5.from(Employee.class);
//criteriaQuery5.select(root5.get("ename"));
//Query<String>query5=session.createQuery(criteriaQuery5);
//List<String>list=query5.list();
//list.forEach(System.out::println);
//
//
//System.out.println("esalry///////////////////...............................");
//
//CriteriaBuilder builder6=session.getCriteriaBuilder();
//CriteriaQuery<Double> criteriaQuery6=builder6.createQuery(Double.class);
//Root<Employee>root6=criteriaQuery6.from(Employee.class);
//criteriaQuery6.select(root6.get("esal"));
//Query<Double>query6=session.createQuery(criteriaQuery6);
//List<Double> strings=query6.list();
//strings.forEach(System.out::println);
//
//
//System.out.println("esalary//////////ename");
//CriteriaBuilder builder7=session.getCriteriaBuilder();
//CriteriaQuery<Object[]>criteriaQuery7=builder7.createQuery(Object[].class);
//Root<Employee>root7=criteriaQuery7.from(Employee.class);
//criteriaQuery7.multiselect(root7.get("esal"),root7.get("ename"));
//Query<Object[]>query7=session.createQuery(criteriaQuery7);
//List<Object[]>list2=query7.list();
//list2.forEach(arr->{
//	System.out.println(arr[0]+" "+arr[1]);
//});


//System.out.println("count.......................count.......count........");
//CriteriaBuilder  builder=session.getCriteriaBuilder();
//CriteriaQuery<Long>criteriaQuery=builder.createQuery(Long.class);
//Root<Employee>root=criteriaQuery.from(Employee.class);
//criteriaQuery.select(builder.count(root));
//Query<Long>query=session.createQuery(criteriaQuery);
//long count=query.getSingleResult();
//System.out.println(count);

//System.out.println("max salary...........");
//
//CriteriaBuilder builder=session.getCriteriaBuilder();
//CriteriaQuery<Double>criteriaQuery=builder.createQuery(Double.class);
//Root<Employee> root=criteriaQuery.from(Employee.class);
//criteriaQuery.select(builder.max(root.get("esal")));
//Query<Double>query=session.createQuery(criteriaQuery);
//double maxsalary=query.getSingleResult();
//System.out.println(maxsalary);


//System.out.println("minimum salary.................");
//
//CriteriaBuilder builder=session.getCriteriaBuilder();
//CriteriaQuery<Double>criteriaQuery=builder.createQuery(Double.class);
//Root<Employee>root=criteriaQuery.from(Employee.class);
//criteriaQuery.select(builder.min(root.get("esal")));
//Query<Double>query=session.createQuery(criteriaQuery);
//Double min=query.getSingleResult();
//System.out.println(min);
 System.out.println("average salary.....................");
 CriteriaBuilder builder=session.getCriteriaBuilder();
 CriteriaQuery<Double>criteriaQuery=builder.createQuery(Double.class);
 Root<Employee>root=criteriaQuery.from(Employee.class);
 criteriaQuery.select(builder.avg(root.get("esal")));
 Query<Double>query=session.createQuery(criteriaQuery);
 Double avg=query.getSingleResult();
 System.out.println(avg);
 












 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
