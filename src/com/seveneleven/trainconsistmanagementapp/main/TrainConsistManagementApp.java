package com.seveneleven.trainconsistmanagementapp.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * =======================================
 * MAIN CLASS - TrainConsistManagementApp
 * =======================================
 * 
 * Use Case 4: Maintain Ordered Bogie Consist
 * 
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * 
 * At this stage, the application:
 * - Adds bogies in a sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * 
 * This maps positional operations using LinkedList.
 * 
 * @author Preetham
 * @version 4.0
 */
public class TrainConsistManagementApp {
	
	/**
	 * Main entry point to the app
	 * 
	 * @param args	Command-Line args
	 */
	public static void main(String[]args) {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println("   === Train Consist Management App ===   ");
		System.out.println("==========================================");
		
		// LinkedList maintains insertion order and allows fast inserts
		List<String> trainConsist = new LinkedList<>();
		
		//Display initial consist information
		System.out.println("Train initializaed sucessfully");
		System.out.println("Inital Bogie Count: " + trainConsist.size());
		System.out.println("Current Train Consist: " + trainConsist);
		System.out.println("\nSystem ready for operations\n");
		
		boolean inMenu = true;
		
		while(inMenu) {
			System.out.println("1. Add Bogies");
			System.out.println("2. Add Bogie to Front");
			System.out.println("3. Add Bogie to Back");
			System.out.println("4. Remove Bogie From Front");
			System.out.println("5. Remove Bogie From Back");
			System.out.println("6. Check if a Bogie is Present");
			System.out.println("7. Display Consists");
			System.out.println("0. Exit");
			System.out.print("Enter Choice: ");
			String choice = scanner.nextLine();
			
			inMenu = switch(choice) {
				case "1" -> {
					System.out.print("Enter the name of bogie to add: ");
					String bogie = scanner.nextLine();
					
					System.out.print("Enter the position of the bogie: ");
					String position = scanner.nextLine();
					
					
					
					trainConsist.add(Integer.parseInt(position), bogie);
					System.out.printf("Added bogie [%s] to train successfully.\n", bogie);
					
					
					yield true;
				}
				case "2" -> {
					System.out.print("Enter the name of bogie to add: ");
					String bogie = scanner.nextLine();
					
					
					trainConsist.addFirst(bogie);
					System.out.printf("Added bogie [%s] to front of the train successfully.\n", bogie);
					
					
					yield true;
				}
				case "3" -> {
					System.out.print("Enter the name of bogie to add: ");
					String bogie = scanner.nextLine();
					
					
					trainConsist.addLast(bogie);
					System.out.printf("Added bogie [%s] to back of the train successfully.\n", bogie);
					
					
					yield true;
				}
				case "4" -> {
					
					String bogie = trainConsist.removeFirst();
					System.out.printf("Removed bogie [%s] from front of the train successfully.\n", bogie);
					
					yield true;
				}
				case "5" -> {
					
					String bogie = trainConsist.removeLast();
					System.out.printf("Removed bogie [%s] from front of the back of the train successfully.\n", bogie);
					
					yield true;
				}
				case "6" -> {
					System.out.print("Enter name of bogie to check: ");
					String bogie = scanner.nextLine();
					
					if(trainConsist.contains(bogie)) {
						System.out.printf("Contains \'%s\'? :  true\n", bogie);
					} else {
						System.out.printf("Contains \'%s\'? :  false\n", bogie);
					}
					
					yield true;
				}
				case "7" -> {
					System.out.println(trainConsist);
					yield true;
				}
				case "0" -> {
					System.out.println("Thank You!!");
					yield false;
				}
				default -> {
					System.out.println("Invalid Choice!!");
					yield true;
				}
			};
		}
		
		scanner.close();
	}
}