package com.java23calisma.ornek;

public class tipler {
	
	public static void main(String arg[]){
		
		int a = 4;
		int b = 8;
		int c = 2;
	
		toplama(a, b);
		cikarma(a, b);
		carpma(a, b);
		bolme(a, b);
		karekok(a, b);
		ustu(a, b);
		delta(a, b, c);
		kokbulma(a, b, c);
		
		
		
		
	}

	static void toplama(int q, int e){
		System.out.println(q+e);
	}
	
	static void carpma(int q, int e){
		System.out.println(q*e);
	}
	
	static void bolme(int q, int e){
		System.out.println(q/e);
	}
	
	static void cikarma(int q, int e){
		System.out.println(q-e);
	}

	static void karekok(int a, int b){
		System.out.println((int) (Math.sqrt(a*b)));
	}
	
	static void ustu(int q, int e){
		System.out.println((int) (Math.pow(q, e)));
	}
	
	static void delta(int q, int e, int r){
		System.out.println((Math.sqrt(((int) (Math.pow(e, 2)-(4*q*r))))));
	}
	    static int ust;
	static void kokbulma(int q, int e, int r){
		
		ust= -e+(int) (Math.sqrt(((int) (Math.pow(e, 2)-(4*q*r)))));
		
		System.out.println(ust/2*q);
		
	}
}
