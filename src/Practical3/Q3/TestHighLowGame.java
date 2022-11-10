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

public class TestHighLowGame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
			"Welcome to The High Low Number Game");
//Create an instance of the HighLowGame called game
		HighLowGame game = new HighLowGame();
		game.generateRandomNumber();
//Invoke generateRandomNumber() to generate random Number
		do {
//Invoke getUserInput()
			game.getUserInput();
//Display the result by invoking getResult()
			JOptionPane.showMessageDialog(null, game.getResult());
		} while (!game.gameEnded());
	}
}