package com.java23calisma.ornek2.kal�t�m2;

public class islem {

	public static void main(String[] args) {
		elbise elbise=new elbise();
		kumas kumas=new kumas();
		
		kumas.setTuru("ipek");
		kumas.kumasKes();
		
		elbise.setTuru("pamuk");
		elbise.setModel("abiye");
		elbise.kumasKes();
	}
	
}
