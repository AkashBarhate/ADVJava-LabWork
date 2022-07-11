package com.springpractice;

import org.springframework.stereotype.Component;

import com.Interface.Bank;

@Component
public class IciciBank implements Bank{

	public boolean isAccountPresent(int acno) {
		if(acno == 202020)
			return true;
		return false;
	}

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("Customer of IciciBank wants to Withdraw money...!!");
	}

	
}
