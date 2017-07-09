package com.java23calisma.ornek2.kalýtým2;

public class elbise extends kumas {
	
	private String model;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	protected void kumasKes() {
		System.out.println(getTuru()+" "+"kumaþý"+" "+model+" "+"þeklinde makinayla dik");
	}
	

}
