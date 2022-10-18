/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
import javax.swing.*;

public class Q2 {

	public static void main(String[] args) {
		Integer ph_level = Integer.parseInt(JOptionPane.showInputDialog("Enter pH level of the tested water:"));
		String level = "";
		if (ph_level > 7) {
			level = "Alkaline";
		} else if (ph_level < 7) {
			level = "Acidic";
		} else if (ph_level == 7) {
			level = "Neutral";
		}
		JOptionPane.showMessageDialog(null, "Your aquarium water is " + level);
	}
}
