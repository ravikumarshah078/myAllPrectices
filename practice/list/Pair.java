package list;

// here the class generiks is used so we can enter the value of X and Y as the users desired.
// here Piar class's generiks are written in < > b/w them.

public class Pair<X , Y> {
	X x;
	Y y;
	
	public Pair(X x , Y y) {
		this.x=x;
		this.y=y;
		
	}
	public void get() {
		System.out.println(x +" "+y);
	}

}
