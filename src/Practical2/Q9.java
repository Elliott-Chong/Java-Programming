/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
public class Q9 {

	public static void main(String[] args) {
		Integer[] numberArray = new Integer[100];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (i % 2) == 0 ? 1 : 2;
		}

		System.out.println("-= Display contents of numberArray[] =-");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println("numberArray[" + i + "] = " + numberArray[i]);
		}
	}
}
