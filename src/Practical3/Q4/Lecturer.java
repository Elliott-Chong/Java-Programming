/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q4;

/**
 *
 * @author elliott
 */
public class Lecturer {
	private String name;
	private int staffID;

	Lecturer(String name, int staffID){
		this.name = name;
		this.staffID = staffID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calcMonthlyPay() {
		return 0.0;
	};

}
