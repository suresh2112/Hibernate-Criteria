package com.createiq.employee.mode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_TAB")

//@NamedNativeQueries({
//    // Using @NamedNativeQuery with parameter binding
//    @NamedNativeQuery(name = "get_total_emp_by_dept", query = "select count(1) from EMPLOYEE where dpt_id=:did"),
//
//    @NamedNativeQuery(name = "get_all_emp", query = "select * from EMPLOYEE",resultClass=Employee.class) 
//})
@NamedNativeQueries({
	 @NamedNativeQuery(name = "get_all_employees", query = "select * from EMP_TAB"),
	 @NamedNativeQuery(name = "GET_BY_ID", query = "SELECT emp_id from EMP_TAB"),
	 @NamedNativeQuery(name = "COUNT_QUERY", query = "SELECT COUNT(*) FROM EMP_TAB"),
	 @NamedNativeQuery(name = "FIND_NAME", query = "select emp_name from EMP_TAB"),
	 @NamedNativeQuery(name = "FIND_BY_ID", query = "select emp_name,emp_sal from EMP_TAB where emp_id=? "),
	@NamedNativeQuery(name = "like", query = "select emp_name from EMP_TAB where emp_name like 's%'")
})

public class Employee {
	@Id
	@Column(name = "emp_id")
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eid;
	@Column(name = "emp_name")
	String ename;
	@Column(name = "emp_sal")
	double esal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	

}
