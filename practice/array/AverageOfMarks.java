package array;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		System.out.println("Enter the no. of students:");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int marks[]=new int[n];
		
		for(int i=0; i<n; i++) {
			
			marks[i]=sc.nextInt();
			
		}
		int averageMarks=0;
		for(int i=0; i<n; i++) {
			averageMarks+=marks[i];
			
		}averageMarks/=n;
		
		System.out.println("The Average Marks are "+averageMarks);

	}

}
