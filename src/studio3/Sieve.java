package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int n = in.nextInt();
		
		boolean[] A = new boolean[n];
		
		for (int i=0; i<A.length; i++) {
			A[i]=true;
		}
		/*
		for (int j=0; j<A.length; j+=2) {
			A[j]=false;
		}
		for (int j=6; j<A.length; j+=3) {
			A[j]=false;
		}
		for (int j=10; j<A.length; j+=5) {
			A[j]=false;
		}
		
		A[1]=false;
		A[2]=true;
		for (int i=0; i<A.length; i++) {
			System.out.println(A[i]);
		}
		*/
		for (int i=2; i<A.length/2; i++) { 
			
			for (int j=i*2; j<A.length; j+=i) {
				A[j]=false;
			}
			
		}
		A[0]=false;
		A[1]=false;
		A[2]=true;
		for (int i=0; i<A.length; i++) {
			if (A[i]){
			System.out.println(i);
			}
		}
		
	}

}
