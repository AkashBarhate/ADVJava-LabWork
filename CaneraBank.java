package com.springpractice;

import org.springframework.stereotype.Component;

import com.Interface.Bank;

@Component
public class CaneraBank implements Bank{

	public boolean isAccountPresent(int acno) {
		if(acno == 101010)
			return true;
		
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of CaneraBank wants to withdraw money..!!");
		
	}
	
	

}
