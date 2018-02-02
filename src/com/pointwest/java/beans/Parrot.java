package com.pointwest.java.beans;

public class Parrot extends AnimalAbstract {
	
	private static final String SIGNATURE_SOUND = "chirp chirp chirp";
	private static final String TYPE = "Parrot";
	
	
	public String getSignatureSound() {
		return SIGNATURE_SOUND;
	}
	
	public String getType() {
		return TYPE;
	}
}
