package com.java23calisma.ders4.ornek1;

public class Bellek extends FlipFlop {
	
	protected int kapasite=128;
	
	protected void kacAdet(int deger) {
		
		super.kacAdet(deger);
		
		sonuc = deger/kapasite;
		
		yuvarla((int) sonuc);
		
	}

}
