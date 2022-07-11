package com.springpractice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Interface.Atm;
import com.Interface.Bank;

@Component("HdfcAtm")
public class HdfcAtm implements Atm{

	@Autowired
	private List<Bank> banks; //here we are making object of bank this is example
	//of loose coupling without spring we cannot get object of bank beacuse bank is an 
	//interface so we hava to make object of icici or canera bank but that was example
	//of tight coupling so this way we can achive loose coupling 
	
	public void withdraw(int acno, double amount) {
		System.out.println("Customer at Hdfc Atm wants to withdraw money");
		Bank currentBank=null;
		for(Bank bank: banks) {
			if(bank.isAccountPresent(acno)) {
				currentBank=bank;
				break;
			}
		}
		currentBank.withdraw( 12345, 101010, 5000);
	}

	
}
