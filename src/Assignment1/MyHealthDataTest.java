package Assignment1;

import java.util.Scanner;

/**
 * The MyHealthDataTest class is the driver class for testing the MyHealthData class.
 * It prompts the user to input patient health data, creates an instance of MyHealthData,
 * and displays the patient's health information
 */

public class MyHealthDataTest {
	/**
	 * The main method is the entry point of the program. It prompts the user for
     * personal and health-related information, creates a MyHealthData object, 
     * and displays the patient's health data using the displayMyHealthData() method.
     * 
	 * @param args command-line arguments
	 */

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("Enter first name:");
        String firstName = input.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter gender: ");
        String gender = input.nextLine();
        
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();
        
        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();
        
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        MyHealthData patient = new MyHealthData(firstName, lastName, gender,birthYear, currentYear,height,weight);

        patient.displayMyHealthData();
        

	}

}
