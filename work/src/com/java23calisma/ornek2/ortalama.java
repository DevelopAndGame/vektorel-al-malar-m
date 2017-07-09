package com.java23calisma.ornek2;

import java.util.Scanner;

public class ortalama {
	
	public static void main(String[] args) {
	
		int[] sayilar=new int[4];
		
		int toplam = 0;
		
		Scanner tara=new Scanner(System.in);
	
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print((i+1)+". sayýyý giriniz :");
			sayilar[i]=tara.nextInt();
		}

		for (int i = 0; i < sayilar.length; i++) {
			toplam=toplam+sayilar[i];
		}
		
		int ortalama =toplam/sayilar.length;
		
		int sonuc=ortalamaBul(ortalama);
		
		System.out.println(sonuc);
		
	}
	
	
	static int ortalamaBul(int ortalama) {
	 
		if(ortalama%2==0){
			
			return ciftOrt(ortalama);
		}
		else {
			
			return tekOrt(ortalama);
		}
		
	}
	
	static int ciftOrt(int ortalama){
		
		
	    return	(int) Math.pow(2, ortalama); 
	}
	
	static int tekOrt(int ortalama){
		
		return (int) Math.pow(3, ortalama);
	}

}
