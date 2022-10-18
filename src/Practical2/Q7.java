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

	public static void main(String[] args) {
		Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
		Double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width"));
		
		String output = "Summary of Rectangle measurements\n"
			+ "Height:    "+height+"\n"
			+ "Width:     "+width+"\n"
			+ "Area:      "+height*width+"\n"
			+ "Perimeter: "+(2*height+2*width)+"\n";

		JOptionPane.showMessageDialog(null, output);
	}
}
