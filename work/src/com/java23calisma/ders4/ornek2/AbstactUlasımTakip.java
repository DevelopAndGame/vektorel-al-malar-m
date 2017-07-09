package com.java23calisma.ders4.ornek2;

public abstract class AbstactUlasýmTakip {

	protected void ekranaYazdir(String deger) {
		
		switch (deger) {
		case "taksi":
			System.out.println("3600. duraða taksi geldi");
			break;

		case "dolmuþ":
			System.out.println("3600. duraða dolmuþ geldi");
			break;
	
		case "otobüs":
			System.out.println("3600. duraða otobüs geldi");
			break;
		default:
			System.out.println("yanlýþ bir veri girdiniz");
			break;
		}
		
		
	}
	
}
