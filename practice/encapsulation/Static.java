package encapsulation;
import java.math.*;
public class Static {
	static int count;
	static String companyName="Rand";
	static int x=5;
	static int y=4;

	static int sq(int x) {
		return x*x;
		
	}
	
	public static void main(String[] args) {
		
		Static n=new Static();
		
		n.sq(5);
		System.out.println(Math.max(x, y));
		System.out.println("Square is "+n.sq(10));
		
	}

}
