package com.pointwest.java.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AnimalAbstract {

	private String name;
	private int age;
	private String gender;
	private int referenceId;
	private String type;
	
	
	public abstract String getType();


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getReferenceId() {
		return referenceId;
	}


	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	
	public abstract String getSignatureSound();
	

	public static List<AnimalAbstract> animalList = new ArrayList<AnimalAbstract>();
	public static int animalShelterSize = 1;
	
	public static void getDetails() {
		
		Scanner myScanner = new Scanner(System.in);
		
		int index = animalList.size() -1;
		
		System.out.print("\nEnter name: ");
		animalList.get(index).name = myScanner.nextLine();
		System.out.print("Enter age: ");
		animalList.get(index).age = Integer.parseInt(myScanner.nextLine());
		System.out.print("Enter gender: ");
		animalList.get(index).gender = myScanner.nextLine();
		
		animalList.get(index).referenceId = 1000 + animalShelterSize;		
	}
	
}
