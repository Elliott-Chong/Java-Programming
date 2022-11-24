/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author elliott
 */
public class CasualEmployee extends Employee {
	Double hourlyRate;
	int hoursWorked;
	CasualEmployee(String name, Double hourlyRate, int hoursWorked )	{
		super(name, 0.0)	;
		this.hourlyRate = hourlyRate;	
		this.hoursWorked = hoursWorked;
	}

	@Override
	public Double calcSalary() {
		return this.hourlyRate * hoursWorked;
	}
	
}
