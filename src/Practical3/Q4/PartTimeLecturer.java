package Practical3.Q4;

import <any?>;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elliott
 */
public class PartTimeLecturer extends Lecturer {
	private double hourlyRate;
	private double monthlyHour;

	PartTimeLecturer(String name,int staffID, double hourlyRate, double monthlyHour){
		super(name, staffID);
		this.hourlyRate = hourlyRate;
		this.monthlyHour = monthlyHour;
	}

	public double calcMonthlyPay(){
		return hourlyRate * monthlyHour;
	}
}
