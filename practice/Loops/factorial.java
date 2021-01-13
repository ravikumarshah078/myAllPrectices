package Loops;

import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fectorial = 1;
		for(int i=n;i>=1;i--) {
			fectorial=fectorial*i;
			
			
			
		}
		System.out.println(fectorial);
		
	}

}
