package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Person;

public class PersonPassportDao {

	public void add(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learningHibernate");
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(person);
		
		tx.commit();
		emf.close();
	}
}
