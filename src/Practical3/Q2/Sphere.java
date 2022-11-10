/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q2;


/**
 *
 * @author elliott
 */
public class Sphere {
	private double radius;	
	Sphere(){
		radius = 0.0;
	}
	Sphere(double radius){
		this.radius = radius;
	}
	
	public double calculateArea(){
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	public double calculateVolume(){
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
