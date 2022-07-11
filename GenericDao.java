package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {

	public void save(Object obj) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("learningHibernate");
		try {
			EntityManager em= emf.createEntityManager();
			EntityTransaction tx =em.getTransaction();
			tx.begin();
		
		em.persist(obj);
		
		tx.commit();
	}
		finally {
		emf.close();	
		}
	}


 public Object fetchById(Class clazz,Object pk) {
	 EntityManagerFactory emf= Persistence.createEntityManagerFactory("learningHibernate");
	 try {
		 	
		 	EntityManager em= emf.createEntityManager();
		 	Object obj = em.find(clazz,pk);
		 	return obj;
		 	
	 	}
	     finally {
	    	 emf.close();
	    	 
	     }
	 }
 
 public void delete(Class clazz, Object pk) {
	 EntityManagerFactory emf= Persistence.createEntityManagerFactory("learningHibernate");
	 try {
		 	
		 	EntityManager em= emf.createEntityManager();
		 	EntityTransaction tx= em.getTransaction();
		 	tx.begin();
		 	
		 	Object obj = em.find(clazz, pk);
		 em.remove(obj);
		 
		 tx.commit();
		 
	 	}
	     finally {
	    	 emf.close();
	    	 
	     }

 }			


}


