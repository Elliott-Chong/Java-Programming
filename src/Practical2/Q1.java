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
import java.util.HashMap;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> weightage = new HashMap<>();
        weightage.put("mst", 0.20);
        weightage.put("assignment1", 0.25);
        weightage.put("assignment2", 0.35);
        weightage.put("gp", 0.20);
        
        System.out.print("Enter MST Scores : ");
        Integer mst = input.nextInt();
        
        System.out.print("Enter Assignment 1 Scores : ");
        Integer assignment1 = input.nextInt();
        
        System.out.print("Enter Assignment 2 Scores : ");
        Integer assignment2 = input.nextInt();
        
        System.out.print("Enter General Performance Scores : ");
        Integer gp = input.nextInt();
        
        double final_score = 0;
        
        final_score += mst * weightage.get("mst");
        final_score += assignment1 * weightage.get("assignment1");
        final_score += assignment2 * weightage.get("assignment2");
        final_score += gp * weightage.get("gp");
        
        System.out.println("Your final scores: "+ String.format("%.2f",final_score));
    }
}
