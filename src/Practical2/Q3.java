/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author elliott
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your option:\n1) Metric Imperial\n2) Imperial");
        System.out.print(">> ");
        Integer option = input.nextInt();
        float mass;
        float height;
        float BMI;
        if (option == 1) {
            System.out.print("Enter your weight in kilograms : ");
            mass = input.nextFloat();
            System.out.print("Enter your height in metres (e.g. 1.75) : ");
            height = input.nextFloat();
            BMI = mass / (height*height);
        }
        
        else if (option == 2) {
            System.out.print("Enter your weight in pounds : ");
            mass = input.nextFloat();
            System.out.print("Enter your height in inches : ");
            height = input.nextFloat();
            BMI = (mass * 703) / (height * height);
        }
        
        else {
            System.out.println("Invalid option!");
            return;
        }
        
        // see if BMI is normal or not
        String status;
        if (BMI < 18.5) {
            status = "underweight";
        }
        else if (BMI >= 25) {
            status = "overweight";
        }
        else {
            status = "normal";
        }
        
        System.out.println("Your BMI is " + String.format("%.2f", BMI) + " and you are " + status);
    }
}
