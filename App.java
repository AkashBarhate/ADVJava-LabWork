package com.app;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Interface.Atm;
import com.springpractice.Calculator;
import com.springpractice.CurrencyConverter;
import com.springpractice.HelloWorld;
import com.springpractice.TextEditor;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-config-spring.xml");
		
		HelloWorld hw= (HelloWorld) ctx.getBean("hello");
		System .out.println(hw.sayHello("Akash"));
		
		Calculator calculator=(Calculator) ctx.getBean("calc");
		System.out.println(calculator.add(12, 5));
		System.out.println(calculator.sub(12, 5));
		
		CurrencyConverter currencyConverter =(CurrencyConverter) ctx.getBean("currCon");
		System.out.println(currencyConverter.convert("USD", "INR", 20));
		System.out.println(currencyConverter.convert("GBP", "INR", 20));
		
		TextEditor textEditor= (TextEditor) ctx.getBean("txtEdtr");
		textEditor.load("abc.txt");
	
		Atm atm=(Atm) ctx.getBean("HdfcAtm");
		atm.withdraw(202020, 50000);
	}

}
         