/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q1;

/**
 *
 * @author elliott
 */
public class TrapeziumUser {
	public static void main(String[] args)	{
		Trapezium t1 = new Trapezium(6.0, 5.0, 4.0);
		System.out.println("Trapezium class program started.\n");
		System.out.println("This trapezium has base value " + t1.getBase());
		System.out.println("This trapezium has top value " + t1.getTop());
		System.out.println("This trapezium has height value " + t1.getHeight() + '\n');
		System.out.println("The area of the trapezium is " + t1.computeArea() + '\n');
		System.out.println("Trapezium class program terminated.");
	}
}
