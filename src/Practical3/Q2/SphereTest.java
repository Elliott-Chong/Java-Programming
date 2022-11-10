/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q2;

/**
 *
 * @author elliott
 */
import javax.swing.JOptionPane;
public class SphereTest {
	public static void main(String[] args)	{
		Sphere s1 = new Sphere(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the sphere:")));
		JOptionPane.showMessageDialog(null, "The area of the sphere is:"+s1.calculateArea() +"\nThe volume of the sphere is: "+s1.calculateVolume());
	}
}
