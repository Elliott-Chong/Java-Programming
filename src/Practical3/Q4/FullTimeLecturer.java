/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q4;

/**
 *
 * @author elliott
 */
public class FullTimeLecturer extends Lecturer {

	String[] PTClass;
	int[] classSize;
	double salary;

	FullTimeLecturer(String name, int staffID, String[] PTClass, int[] classSize, double salary) {
		super(name, staffID);
		this.PTClass = PTClass;
		this.classSize = classSize;
		this.salary = salary;
	}

	public double calcMonthlyPay() {
		return salary;
	}

	public double calcPTLunchSubsidy() {
		int result = 0;
		for (int size : classSize) {
			result += size * 10;
		}
		return result;
	}

}
