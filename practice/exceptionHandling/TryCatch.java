package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
//		for the exception handling we use the try and catch block.. in the try block we use in it that exception method 
//		that can be throw an exception and the catch block we write the message and the solution of the exception to dissolve
//		the exception.
//		
		try {
//			int d[]=new int[5];
//			System.out.println(d[6]);
			int a=5;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}catch (ArithmeticException e) {	//catch block can be 2 or more for the further the different exception handling.
			System.out.println(e.getMessage()+" exception occures");
			System.out.println("Enter the diffrent no. of a:");
//			here the peace of code is written / catch can handel the codes also.
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();		
			System.out.println("Enter diffrent no. b:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("your answer is "+c);
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage()+" you are not in range");
			
		}
		
//		finally block is execute always after the catch block it is the like default that can be executed after that.
		
		finally {
			System.out.println("you are intelligent.");
		}
		
		System.out.println("1st line");
		System.out.println("2nd line");
		
	}

}
