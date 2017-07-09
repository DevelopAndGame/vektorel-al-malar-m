package com.java23calisma.ornek;

public class diziler {

	public static void main(String[] args) {
		int dizi1[]={5,6,4,8};
		int dizi3[]={8,9,7,5,6,9,4,2};
		int dizi2[]=new int[dizi1.length];
		
		diziFonk(dizi1, dizi2, dizi3);
		
		
	}
	
	
	static int[] diziFonk(int[] dizi1, int[] dizi2, int[] dizi3) {
	
		for (int i = 0; i < dizi1.length; i++) {
			
			dizi2[i]=dizi1[i]*dizi3[i];
			
		}
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		return dizi2;
		
	}
	
}
