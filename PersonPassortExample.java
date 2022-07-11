package com.example;

import java.time.LocalDate;

import com.dao.PersonPassportDao;
import com.entity.Passport;
import com.entity.Person;

public class PersonPassortExample {

	public static void main(String [] args) {
		
		PersonPassportDao dao= new PersonPassportDao();
		
		Person p = new Person();
		p.setName("Akshay");
		p.setEmail("akshay@gmail");
		p.setDateOfBirth(LocalDate.of(1997, 12, 29));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2021, 07, 15));
		ps.setExpiryDate(LocalDate.of(2031, 07, 15));
		ps.setIssuedBy("Govt. of India");
	
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
	}
	
}
