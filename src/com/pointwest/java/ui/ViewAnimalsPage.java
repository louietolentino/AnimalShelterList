package com.pointwest.java.ui;

import com.pointwest.java.beans.AnimalAbstract;

public class ViewAnimalsPage {

	public void displayViewAnimalsPage() {
		
		HomePage homePage = new HomePage();
		
		System.out.println("\n\nMeet our lovely animal friends!");
		for (AnimalAbstract animal : AnimalAbstract.animalList) {
			System.out.println(animal.getReferenceId() + " : " + animal.getSignatureSound() + " ... Hi I'm " + animal.getName() + " the " + animal.getType() + ", " + animal.getAge() + " years old.");
		}
		homePage.displayHomePage();
	}
	
}
