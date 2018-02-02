package com.pointwest.java.beans;

public class Dog extends AnimalAbstract {
	

	private static final String SIGNATURE_SOUND = "arf arf arf";
	private static final String TYPE = "Dog";
	
	
	public String getSignatureSound() {
		return SIGNATURE_SOUND;
	}
	
	public String getType() {
		return TYPE;
	}
	

}
