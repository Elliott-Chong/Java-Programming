/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q3;

/**
 *
 * @author elliott
 */
import javax.swing.*;
public class HighLowGame {

	private int randomNumber;
	private int guess;

	public void generateRandomNumber() {
		this.randomNumber = (int) Math.floor(Math.random() * 100);
	}
	public void getUserInput(){
		this.guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
	}
	public String getResult(){
		if (this.guess < this.randomNumber){
			return guess + " is lower than the Magic Number";
		}
		else if (this.guess > this.randomNumber){
			return guess + " is higher than the Magic Number";
		}
		else {
			return "You are right!";
		}
	}
	public boolean gameEnded(){
		return this.guess == this.randomNumber;
	}
}
