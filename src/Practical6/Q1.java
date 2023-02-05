/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			Integer[] marks = new Integer[10];
			PrintWriter pw;
			pw = new PrintWriter(new FileWriter("src/Practical6/output.txt"));
			for (int i = 0; i < 10; i++) {
				System.out.println("Please enter " + (i + 1) + " student's score: ");
				Integer input = Integer.parseInt(scanner.nextLine());
				pw.println(input);
			}
			pw.close();

			File myObj = new File("src/Practical6/output.txt");
			Scanner myReader = new Scanner(myObj);
			int sum = 0;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				sum += Integer.parseInt(data);
			}
			myReader.close();
			System.out.println("The average score is " + (float) sum / 10.0);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
