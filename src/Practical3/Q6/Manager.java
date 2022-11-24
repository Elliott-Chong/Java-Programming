/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author elliott
 */
public class Manager extends Employee {
	Double profit;
	Manager(String name, Double baseSalary, Double profit)	{
		super(name, baseSalary);
		this.profit = profit;	
	}
	@Override
	public Double calcSalary(){
		return this.baseSalary + (0.1 * this.profit)	;
	}
}
