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
public class Q4 {
    public static void main(String[] args) {
        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value:"));
        if (num < 1 || num > 10) {
            JOptionPane.showMessageDialog(null, "Out of range! Please enter a number between 1 - 10!", "error", JOptionPane.ERROR_MESSAGE);
        }
        
        String roman="";
        switch (num) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                System.out.println("This should not run");
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Roman Numeral Value: " + roman);
    }
}
