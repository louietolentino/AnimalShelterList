package com.pointwest.java.ui;

import java.util.Iterator;
import java.util.Scanner;

import com.pointwest.java.beans.AnimalAbstract;

public class RemoveAnimalPage {

	public void displayRemoveAnimalPage() {
		
		HomePage homePage = new HomePage();
		Scanner myScanner = new Scanner(System.in);
		Iterator<AnimalAbstract> iterator = AnimalAbstract.animalList.iterator();
		boolean foundIndicator = false;
		
		System.out.print("Please enter the reference ID of the animal to remove: ");
		int userInput = myScanner.nextInt();
		while(iterator.hasNext()) {
			AnimalAbstract animalHolder = iterator.next();
			if (animalHolder.getReferenceId() == userInput) {
				iterator.remove();
				foundIndicator = true;
				System.out.println("The animal is now removed.");
			}
		}
		if (!foundIndicator) {
			System.out.println("Animal ID not found.");
		}
		homePage.displayHomePage();
	}
	
}
