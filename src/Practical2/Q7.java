/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
import javax.swing.JOptionPane;

public class Q7 {

	private static Double getHeight() {
		Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
		return height;
	}

	private static Double getWidth(){	
		Double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width"));
		return width;
	}

	public static void main(String[] args) {
		Double height = getHeight();
		Double width = getWidth();

		String output = "Summary of Rectangle measurements\n"
			+ "Height:    " + height + "\n"
			+ "Width:     " + width + "\n"
			+ "Area:      " + height * width + "\n"
			+ "Perimeter: " + (2 * height + 2 * width) + "\n";

		JOptionPane.showMessageDialog(null, output);
	}
}
