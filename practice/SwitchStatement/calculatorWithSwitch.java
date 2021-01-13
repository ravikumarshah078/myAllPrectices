package SwitchStatement;

import java.util.Scanner;

public class calculatorWithSwitch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FIrst no:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second no:");
		int b=sc.nextInt();
		
		System.out.println("Enter operation");
		
//		after int the string value is not be taken directly in 1st trail.
//		
		
		
		 char Operation = sc.nextLine().charAt(0);
		 
		 int  result = 0;
		 
		 switch(Operation){
			 case '+':
				 result=a+b;
				 break;
			 case '-':
				 result=a-b;
				 break;
			 case '*':
				 result=a*b;
				 break;
			 case '/':
				 result=a/b;
				 break;
			 default:
				 System.out.println("Invalid operation");
		 }
		 System.out.println(result);
		 
				 
		 }
		
		

	}
	

