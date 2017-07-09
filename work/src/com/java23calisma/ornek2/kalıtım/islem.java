package com.java23calisma.ornek2.kalýtým;

public class islem {

	public static void main(String[] args) {
		
		SporAraba sporAraba=new SporAraba();
		BinekAraba binekAraba=new BinekAraba();
		
		sporAraba.setMotor(5.0);
		sporAraba.setMarka("BMW");
		sporAraba.setModel("i8");
		
		System.out.println(sporAraba.marka);
		System.out.println(sporAraba.model);
		System.out.println(sporAraba.motor);
		
	}
	
}
