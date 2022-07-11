package com.MainProject;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.Interface.CarPartsInventory;

@Component("carParts3")
public class CarPartsInventoryImpl3 implements CarPartsInventory{

	
		//@Autowired doesn't works if we need to inject EntityManager object
		@PersistenceContext
		private EntityManager em;
	
		
		@Transactional
		public void addNewPart(CarPartsInventory carPart)  {
		  
			em.persist(carPart);
		
		
	}


		public List<CarPart> getAvailableParts() {
			// TODO Auto-generated method stub
			return null;
		}

}
