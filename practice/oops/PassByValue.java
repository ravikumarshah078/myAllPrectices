package oops;

public class PassByValue {

	public static void main(String[] args) {
		
		int a=32;
		int b=37;
		swap(a,b);
		
		System.out.println(a+" "+b);
	}
	static void swap(int c,int d) {
		int temp=c;
		c=d;
		d=temp;
		
		System.out.println(c+" "+d);
	}

}
                           