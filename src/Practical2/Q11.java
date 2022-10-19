/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
import java.util.*;

public class Q11 {

	public static void main(String[] args) {
		HashMap<String, Double> grades = new HashMap<>();
		grades.put("A", 4.0);
		grades.put("B", 3.0);
		grades.put("C", 2.0);
		grades.put("D", 1.0);
		Double total_credits = 0.0;
		Double total_weight = 0.0;

		Scanner input = new Scanner(System.in);
		for (int i = 0;; i++) {
			System.out.print("Enter grade for module #" + (i + 1) + " (or enter 0 to stop) : ");
			String grade = input.next();
			if (grade.equals("0")) {
				break;
			}
			System.out.print("Enter credit units for module #" + (i + 1) + " : ");
			Double weight = input.nextDouble();
			total_weight += weight;
			total_credits += grades.get(grade.toUpperCase()) * weight;
		}
		System.out.println("Your total credit units : " + total_credits);
		System.out.println("Your GPA is " + String.format("%.2f", total_credits / total_weight));
	}
}
