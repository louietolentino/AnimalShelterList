package com.pointwest.java.beans;

public class Cat extends AnimalAbstract {

	private static final String SIGNATURE_SOUND = "meow meow meow";
	private static final String TYPE = "Cat";
	
	
	public String getSignatureSound() {
		return SIGNATURE_SOUND;
	}
	
	public String getType() {
		return TYPE;
	}
}
