package com.java23calisma.ornek2.kal�t�m2;

public class elbise extends kumas {
	
	private String model;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	protected void kumasKes() {
		System.out.println(getTuru()+" "+"kuma��"+" "+model+" "+"�eklinde makinayla dik");
	}
	

}
