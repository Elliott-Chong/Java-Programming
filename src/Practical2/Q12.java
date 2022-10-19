/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base number: ");
		Integer base = input.nextInt();
		System.out.print("Enter last number: ");
		Integer last = input.nextInt();

		if (base < 2 || base > 8 || last < 2 || last > 8) {
			System.out.println("Invalid, please enter a number from 2 - 8 inclusive");
			return;
		}

		// print rows
		for (int i = 1; i <= 25; i++) {
			// print columns
			for (int j = base; j <= last; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
	}
}
