/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
public class Q6 {

	public static void displayInfo() {
		System.out.println("Name           : Elliott!");
		System.out.println("Sex            : Male");
		System.out.println("Location       : Singapore");
		System.out.println("Martial Status : Single & Ready to mingle!");
	}

	public static void displayAsterisks(Integer num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Integer num = 40;
		displayAsterisks(num);
		displayInfo();
		displayAsterisks(num);
	}
}
