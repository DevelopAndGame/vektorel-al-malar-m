package com.java23calisma.ders4.ornek2;

public abstract class AbstactUlas�mTakip {

	protected void ekranaYazdir(String deger) {
		
		switch (deger) {
		case "taksi":
			System.out.println("3600. dura�a taksi geldi");
			break;

		case "dolmu�":
			System.out.println("3600. dura�a dolmu� geldi");
			break;
	
		case "otob�s":
			System.out.println("3600. dura�a otob�s geldi");
			break;
		default:
			System.out.println("yanl�� bir veri girdiniz");
			break;
		}
		
		
	}
	
}
