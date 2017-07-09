package com.java23calisma.ornek;

public class Swcm {
	
	public int islem(int a, int b, char c){

		int sonuc = 0;
		
		switch (c) {
		case '+':
			
			sonuc = a+b;
			
			break;

		case '-':
			
			sonuc = a-b;
			
			break;

		default:
			
			System.out.println("!!!yanlýþ bir karakter girdiniz!!!");
			
			break;
		}
		
		return sonuc;
		
	}

}
