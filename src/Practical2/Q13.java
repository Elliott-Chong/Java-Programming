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

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a valid character to be used: ");
		String c = input.next();
		if (c.length() != 1) {
			c = "*";
		}

		System.out.print("Please enter height of pyramid ( 1 - 10 ) : ");
		Integer height = input.nextInt();
		if (height < 1 || height > 10) {
			height = 3;
		}

		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

		for (int i = height - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
