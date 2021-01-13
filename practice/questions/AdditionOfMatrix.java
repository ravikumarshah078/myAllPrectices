package questions;
import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the diamentions");
		
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		
		System.out.println("Enter array a:");
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<cols; j++) {
				a[i][j]=sc.nextInt();
			
			}
			
		}
		System.out.println("Enter ayyar b:");
			for(int i=0; i<rows; i++) {
			
			for(int j=0; j<cols; j++) {
				b[i][j]=sc.nextInt();
			
			}
			
		}
			int c[][]=new int[rows][cols];

			for(int i=0; i<rows; i++) {
	
				for(int j=0; j<cols; j++) {
					c[i][j]=a[i][j]+b[i][j];
	
							}
					}
		
	System.out.println("Result is:");
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			System.out.print(c[i][j]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	}
	
	}
