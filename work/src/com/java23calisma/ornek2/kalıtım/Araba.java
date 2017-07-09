package com.java23calisma.ornek2.kalýtým;

public class Araba {
	
	protected double motor;
	protected String marka;
	protected String model;
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMotor(double motor) {
		this.motor = motor;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getMotor() {
		return motor;
	}
	
}
