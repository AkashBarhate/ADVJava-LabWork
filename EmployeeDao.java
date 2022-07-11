package com.Hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class EmployeeDao {
	
		
		public void add(Employee emp)
		{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("learningHibernate");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		em.persist(emp);
		
		tx.commit();
		emf.close();
		
		
		}
		
		public Employee fetch(int empno) {
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("learningHibernate");
			EntityManager em= emf.createEntityManager();
			
			//find method generates select query where pk=?
			Employee emp =em.find(Employee.class,empno);
			
			emf.close();
			return emp;
			
		}
		
		public List<Employee> fetchAll(){
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("learningHibernate");
			EntityManager em= emf.createEntityManager();
			
			Query q=em.createQuery("select e from Employee e");  
			List<Employee> list =q.getResultList();
			
			emf.close();
			return list;
		}
		public List<Employee> fetchBySalary(int salary){
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("learningHibernate");
			EntityManager em= emf.createEntityManager();
			
			Query q= em.createQuery("select e from Employee e where e.salary >= :sal");
			q.setParameter("sal",salary);
			List<Employee> list = q.getResultList();
			
			emf.close();
			return list;
		}
		
		public List<Object[]> fetchNamesAndSalary(){
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("learningHibernate");
			EntityManager em= emf.createEntityManager();
			
			Query q=em.createQuery("Select e.name, e.salary from Employee e");
			List<Object[]> list =q.getResultList();
			
			emf.close();
			return list;
		}
		
	}
	
