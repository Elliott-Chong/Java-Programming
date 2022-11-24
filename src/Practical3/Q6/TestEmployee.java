/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author elliott
 */
public class TestEmployee {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new CasualEmployee("John", 10.0, 30);
		employees[1] = new CasualEmployee("Mary", 5.0, 50);
		employees[2] = new Manager("Peter", 3000.0, 5000.0);
		displaySalary(employees);

	}

	public static void displaySalary(Employee[] employees) {
		for (Employee e : employees) {
			System.out.println("Name: " + e.getName());
			System.out.println("Salary: $" + e.calcSalary());
			System.out.println("");
		}
	}
}
