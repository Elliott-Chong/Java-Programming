/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author elliott
 */
import javax.swing.*;

public class School {

	private Person[] persons;
// used to store lecturer or student objects
	private int numOfPeople;
// used to keep track of the number of people

	public School() {
		numOfPeople = 0; // School is empty initially
		populateSchool();
		displayPopulation();
	}

	public void populateSchool() {
		String inStr = JOptionPane.showInputDialog(
			null,
			"Enter number of people to create: ",
			"School",
			JOptionPane.QUESTION_MESSAGE);
		int size = Integer.parseInt(inStr);
		persons = new Person[size];
		for (; numOfPeople < size; numOfPeople++) {
			if (Math.floor(Math.random() * 2) == 0) {
				createStudent();
			} else {
				createLecturer();
			}
			System.out.println(persons);
		}
//create Persons array with the size
//entered by the user
// Use a loop, in the loop:
//
// (1) Generate a random number from 1 to 2
// (2) If number is 1,
//add a student object to the persons array.
//You will need to call createStudent() method.
// (3) If the number is 2,
//add a lecturer object to the persons array.
//You will need to call createLecturer() method.
	}

	public void createStudent() {
		String name = JOptionPane.showInputDialog(
			null,
			"Enter Name:",
			"School - Create Student",
			JOptionPane.QUESTION_MESSAGE);
		String inStr = JOptionPane.showInputDialog(
			null,
			"Enter year of Study:",
			"School - Create Student",
			JOptionPane.QUESTION_MESSAGE);
//Create a Student object based on the values entered
// and store the object in the persons array
		persons[numOfPeople] = new Student(name, inStr.charAt(0));
	}

	public void createLecturer() {
// Write the code needed to create a lecturer object.
// It will prompts the user to enter the no. of modules
// and the module code(s) that the lecturer is teaching.
// For example, if the lecturer teaches 3 modules,
// it will prompt the user to enter the module code 3
// times.
// It then creates a Lecturer object and
// stores in the persons array
		String name = JOptionPane.showInputDialog(null, "Enter the name of the lecturer: ", "School - Create Lecturer", JOptionPane.QUESTION_MESSAGE);
		int num_modules = Integer.parseInt(JOptionPane.showInputDialog(
			null,
			"Enther the number of modules:",
			"School - Create Lecturer",
			JOptionPane.QUESTION_MESSAGE));
		String[] modules = new String[num_modules];
		for (int i = 0; i < num_modules; i++) {
			String module = JOptionPane.showInputDialog(null, "Enter the name of the module:", "Module Selection", JOptionPane.QUESTION_MESSAGE);
			modules[i] = module;
		}
		persons[numOfPeople] = new Lecturer(name, modules);
	}

	public void displayPopulation() {
		// Write the code to display the information about
		// each person in the school.		JOptionPane.QUESTION_MESSAGE);
// It uses the introduce() method in each class
// to achieve this.
		for (int i = 1; i <= persons.length; i++) {
			System.out.println("Person " + i + ":");
			persons[i - 1].introduce();
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		School school = new School();
	}
}
