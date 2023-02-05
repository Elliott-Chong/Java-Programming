/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6.Q2;

/**
 *
 * @author elliott
 */
import java.io.Serializable;

public class Product implements Serializable {

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String code;
	private double price;

	public Product(String s, double p) {
		code = s;
		price = p;
	}
}
