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

public class Q10 {

	public static Integer getMax(Integer[] arr) {
		Integer max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

//	public static void main(String[] args) {
//		Integer[] intArray = new Integer[]{11, 0, 10, 2, 2};
//		System.out.print("Elements of intArray: ");
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i] + " ");
//		}
//		System.out.println();
//		System.out.println("Highest element : " + getMax(intArray));
//	}
	// part c
	public static void main(String[] args) {
		Integer[] intArray = new Integer[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Enter value for intArray[" + i + "] -> ");
			Integer num = input.nextInt();
			intArray[i] = num;
		}

		System.out.print("\nElements of intArray:");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);
		}

		System.out.println("\nHighest Element: " + getMax(intArray));
	}
}
