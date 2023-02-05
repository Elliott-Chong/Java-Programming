/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6.Q3;

/**
 *
 * @author elliott
 */
import java.io.Serializable;

public class Bread implements Serializable {

	private String name;
	private int amtOfFlour;
	private int noOfLoaves;

	public Bread(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmtOfFlour() {
		return amtOfFlour;
	}

	public void setAmtOfFlour(int amtOfFlour) {
		this.amtOfFlour = amtOfFlour;
	}

	public int getNoOfLoaves() {
		return noOfLoaves;
	}

	public void setNoOfLoaves(int noOfLoaves) {
		this.noOfLoaves = noOfLoaves;
	}
}
