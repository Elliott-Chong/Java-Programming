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

public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sum = 0.0;
        Double average = 0.0;

        for (int i = 1;; i++) {
            System.out.print("Enter score# " + i + " (or enter -1 to stop) : ");
            Double score = input.nextDouble();

            if (score == -1) {
                average = sum / (i - 1);
                break;
            }
            sum += score;
        }

        String letter_grade = "";
        if (average >= 80) {
            letter_grade = "A";
        } else if (average >= 70) {
            letter_grade = "B";
        } else if (average >= 60) {
            letter_grade = "C";
        } else if (average >= 50) {
            letter_grade = "D";
        } else {
            letter_grade = "F";
        }
        System.out.println("Average score = " + String.format("%.2f", average) + " Grade = " + letter_grade);
    }
}
