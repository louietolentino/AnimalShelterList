package com.pointwest.java.ui;

import java.util.Scanner;

import com.pointwest.java.beans.AnimalAbstract;
import com.pointwest.java.beans.Cat;
import com.pointwest.java.beans.Dog;
import com.pointwest.java.beans.Parrot;

public class AddAnimalPage {
	
	public void displayAddAnimalPage() {
		
		HomePage homePage = new HomePage();
		Scanner myScanner = new Scanner(System.in);
		
		if (AnimalAbstract.animalList.size() == 10) {
			System.out.print("\nThe shelter is now full. We can no longer accept a new animal.\nDo you want to continue?\n[1]\tYes\n[2]\tNo\nEnter choice: ");
			int choice = myScanner.nextInt();
			switch (choice) {
			case 1:	homePage.displayFullShelterHomePage();
					break;
			case 2: homePage.displayGoodbyeMessage();
					break;
			default:
				break;
			}
		}
		
		if (AnimalAbstract.animalList.size() < 10) {
			System.out.print("\n\nWhat animal are you trying to add?\n[1]\tDog\n[2]\tCat\n[3]\tParrot\nEnter choice: ");
			int choice = myScanner.nextInt();
			switch (choice) {
			case 1:	AnimalAbstract.animalList.add(new Dog());					
					break;
			case 2:	AnimalAbstract.animalList.add(new Cat());
					break;
			case 3:	AnimalAbstract.animalList.add(new Parrot());
					break;
			}
			AnimalAbstract.getDetails();
			AnimalAbstract.animalShelterSize++;
			System.out.println("Animal is now added.");
			homePage.displayHomePage();
		}
		
		
	}

}
