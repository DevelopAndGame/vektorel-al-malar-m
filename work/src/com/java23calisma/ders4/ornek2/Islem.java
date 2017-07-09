package com.java23calisma.ders4.ornek2;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		
		Scanner tara=new Scanner(System.in);
		
		String vasita=tara.nextLine();
		
		
		Minibus minibus =new Minibus();
		
		minibus.ekranaYazdir(vasita);
		
	
	}

}
