package com.java23calisma.ders4.ornek1;

public class FlipFlop {

	protected int kapasite = 1;
	
	protected double sonuc=0;
	
	protected void kacAdet(int deger) {
		
		
		
		sonuc=(deger)/(kapasite);
		
	}
	
	protected void yuvarla(int sonuc){
		
		sonuc=(int) Math.ceil(this.sonuc);
		
		System.out.println(sonuc);	
	}
	
}
