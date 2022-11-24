/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author elliott
 */
public class Person {
	private String name;	

	Person() {
		this.name = "";
	}
	
	Person(String name){
		this.name = name;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void introduce(){
		System.out.println("My name is " + this.getName());
	}
	
}
