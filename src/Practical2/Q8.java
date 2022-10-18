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

public class Q8 {

	public static Integer getTotalSeconds() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total seconds : ");
		return input.nextInt();
	}

	public static Integer getHours(Integer seconds) {
		return seconds / 3600;
	}

	public static Integer getMinutes(Integer seconds) {
		return (seconds % 3600) / 60;
	}

	public static Integer getSeconds(Integer seconds) {
		return (seconds % 3600) % 60;
	}

	public static void main(String[] args) {
		Integer total_seconds = getTotalSeconds();
		System.out.println("\n\t Time Converter");
		Integer hours = getHours(total_seconds);
		Integer minutes = getMinutes(total_seconds);
		Integer seconds = getSeconds(total_seconds);

		System.out.println("Total seconds : " + total_seconds);
		System.out.println("Hours   : " + hours);
		System.out.println("Minutes : " + minutes);
		System.out.println("Seconds : " + seconds);
	}
}
