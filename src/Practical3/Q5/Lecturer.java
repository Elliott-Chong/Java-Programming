/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author elliott
 */
public class Lecturer extends Person{
	private String[] modules;
	public Lecturer(){
		this.modules = null;
	}
	public Lecturer(String name, String[] modules){
		super(name);
		this.modules = modules;
	}

	public String[] getModules() {
		return modules;
	}

	public String getModule(int i){
		return this.modules[i];
	}

	public void setModules(String[] modules) {
		this.modules = modules;
	}

	@Override
	public void introduce(){
		System.out.println("My name is "+this.getName());
		System.out.println("I am the lecturer of the following modules:");
		for (int i = 1; i <= this.modules.length; i++){
			System.out.println(i + ". "+this.modules[i-1]);
		}
	}

}
