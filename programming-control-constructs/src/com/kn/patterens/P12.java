package com.kn.patterens;

public class P12 {

	public static void main(String[] args) {
		int k =0;
		int n=7;
		for (int i =1 ; i<=n;i++) {
			int c= (i<=4)?k++:k--;
			for(int j =1; j<=n;j++) {
				if(j==5-k || j == k+3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
