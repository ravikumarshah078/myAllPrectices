package userInput;

import java.util.Scanner;

public class ternaryOprator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int min=0;
	
		int max=0;
		if(a>b) {
			max=a;
		}
		else {
			max=b;
			
		
		}
		min=a<b?a:b;
		
		System.out.println(max +" is the max no.");
		System.out.println(min+" is the minimum no.");
		

	}

}
