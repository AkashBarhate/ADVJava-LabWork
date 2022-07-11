package com.Hibernate;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class InsertEmployee {
   
	public static void main(String[] args) {
		
	/*	
	 Employee emp = new Employee();
	 emp.setEmpno(103);
	 emp.setName("Aniket");
	 emp.setSalary(90000);
	 emp.setJoingDate(LocalDate.of(2022, 10, 05));
	 
	 EmployeeDao dao= new EmployeeDao();
	 dao.add(emp);
	 */
		
		/*
		Employee emp = new Employee();
		EmployeeDao dao= new EmployeeDao();
		emp=dao.fetch(103);
		System.out.println(emp.getName()+"......"+emp.getSalary()+"....."+emp.getJoingDate());
		*/
	   
	/*
		EmployeeDao dao= new EmployeeDao();
		List<Employee> list=dao.fetchAll();
		for(Employee emp: list)
		System.out.println(emp.getEmpno()+"...."+emp.getName()+"..."+emp.getSalary()+"..."+emp.getJoingDate());
	*/
	/*
	EmployeeDao dao = new EmployeeDao();
	List<Employee> list= dao.fetchBySalary(85000);
	for(Employee emp: list)
		System.out.println(emp.getSalary());
*/	
	EmployeeDao dao = new EmployeeDao();
	List<Object[]> namesAndSalary=dao.fetchNamesAndSalary();
	for(Object[] arr: namesAndSalary)
		System.out.println(arr[0]+"...."+arr[1]);
	
	}
}