package com.pointwest.java.ui;

import java.util.Scanner;


public class HomePage {

	public void displayHomePage() {
		
		Scanner myScanner = new Scanner(System.in);
		AddAnimalPage addAnimalPage = new AddAnimalPage();
		RemoveAnimalPage removeAnimalPage = new RemoveAnimalPage();
		ViewAnimalsPage viewAnimalsPage = new ViewAnimalsPage();
		
		System.out.println("\n\nWelcome to JC's Animal Shelter!");
		System.out.print("Please select an option:\n[1]\tAdd an Animal\n[2]\tRemove an Animal\n[3]\tView all Animals\n\nEnter choice: ");
		int choice = myScanner.nextInt();
		switch (choice) {
		case 1:	addAnimalPage.displayAddAnimalPage();
				break;
		case 2:	removeAnimalPage.displayRemoveAnimalPage();
				break;
		case 3:	viewAnimalsPage.displayViewAnimalsPage();
				break;
		}
			
	}
	
	
	public void displayGoodbyeMessage() {
		System.out.println("\n\nProgram ends. Goodbye!");
	}
	
	public void displayInitialHomePage() {
		
		Scanner myScanner = new Scanner(System.in);
		AddAnimalPage addAnimalPage = new AddAnimalPage();
		
		System.out.print("\nWelcome to JC's Animal Shelter!\n\nThe shelter is currently empty.\n\nWould you like to add an animal now?\n[1]\tYes\n[2]\tNo\nEnter choice: ");
		int choice  = myScanner.nextInt();
		switch (choice) {
		case 1:	addAnimalPage.displayAddAnimalPage();
				break;
		case 2:	displayGoodbyeMessage();
				break;
		}
	}
	
	public void displayFullShelterHomePage() {
		
		Scanner myScanner = new Scanner(System.in);
		RemoveAnimalPage removeAnimalPage = new RemoveAnimalPage();
		ViewAnimalsPage viewAnimalsPage = new ViewAnimalsPage();
		
		System.out.println("\n\nWelcome to JC's Animal Shelter!");
		System.out.print("Please select an option:\n[1]\tRemove an Animal\n[2]\tView all Animals\n\nEnter choice: ");
		int choice = myScanner.nextInt();
		switch (choice) {
		case 1:	removeAnimalPage.displayRemoveAnimalPage();
				break;
		case 2:	viewAnimalsPage.displayViewAnimalsPage();
				break;
		}
	}
	
}
