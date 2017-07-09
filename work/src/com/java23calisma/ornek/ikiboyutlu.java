package com.java23calisma.ornek;

public class ikiboyutlu {
	
	public static void main(String[] args) {
		
		int[][] birinci=new int[10][10];
		for (int i = 0; i < birinci.length; i++) {
			for (int j = 0; j < birinci[i].length; j++) {
				
				birinci[i][j]=i*j;
				System.out.print(birinci[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
