/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q1;

/**
 *
 * @author elliott
 */
public class Trapezium {
	private double base;
	private double top;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getTop() {
		return top;
	}

	public void setTop(double top) {
		this.top = top;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	Trapezium (double base, double top, double height){
		this.base = base;
		this.top = top;	
		this.height = height;
	}

	public double computeArea(){
		return (base + top) * height / 2;
	}
}
