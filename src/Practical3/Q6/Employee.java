/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author elliott
 */
abstract public class Employee {
	String name;
	Double baseSalary;

	Employee(String name, Double baseSalary) {
		this.name = name;	
		this.baseSalary = baseSalary;
	}

	public String getName(){
		return this.name;
	}
	public Double getBaseSalary(){
		return this.baseSalary;
	}
	abstract public Double calcSalary();
}
