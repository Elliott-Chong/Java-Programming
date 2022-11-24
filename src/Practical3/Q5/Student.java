/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author elliott
 */
public class Student extends Person {
	private char stdYear;
	
	Student(String name, char stdYear){
		super(name);
		this.stdYear = stdYear;
	}

	@Override
	public void introduce(){
		System.out.println("My name is " + getName());
		System.out.println("I am a year "+this.stdYear + " student." );
	}
}
