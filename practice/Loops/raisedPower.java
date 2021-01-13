package Loops;

import java.util.Scanner;

import com.sun.source.util.DocTreeScanner;

public class raisedPower {

	public static void main(String[] args) {
//		
		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter no:");
//		int a=sc.nextInt();
//		System.out.println("Enter raised power no:");
//		int b=sc.nextInt();
//		int result =1;
//		
//	for(int i=0; i<b; i++) {
//		
//		result*=a;
//		
//	}
//	System.out.println(a+" Riased to the power "+b+ " is " + result);
//		
		int c=1;
		int k=2;
		 int n=sc.nextInt();
		for(int j=1;j<n-1; j++){
             c*=k;
             System.out.println(c);
         }
	}
		
		
	}

