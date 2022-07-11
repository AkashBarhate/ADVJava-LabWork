package com.Hibernate;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "emp12")
public class Employee {
	
	@Id
	@Column(name= "empno")
	private int empno;
	
	@Column(name="ename")
	private String name;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="joining_date")
	private LocalDate joingDate;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getJoingDate() {
		return joingDate;
	}

	public void setJoingDate(LocalDate joingDate) {
		this.joingDate = joingDate;
	}

	
	
		

}
