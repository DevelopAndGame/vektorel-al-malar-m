package com.java23calisma.ornek;

public class ifelsewhile {
	
	public static void main(String[] args) {
		
		dongu();
		dongu1();

		
	}

	static void dongu(){
	
		
	for (int i = 0; i < 20; i++) {
			
		System.out.println(Math.pow(i, 2));
	}
	
	}
	
	static void dongu1(){
		
		int sayac = 15;
	
		
		while (sayac>0) {
		
			System.out.println( Math.sqrt(sayac));
			sayac --;
		}
	
	}
	
}
