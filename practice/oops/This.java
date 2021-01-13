package oops;

public class This {
	
	int wheels;
	 static int headlights;
	String color;
	
	This(int wheels){
		this.wheels=wheels;
		headlights=2;
		
	}
	This(int wheels, String color){
		this.wheels=wheels;
		this.color=color;
		headlights=2;
		
	}

	public static void main(String[] args) {
		
		This car=new This(4);
		This car1=new This(3,"black");
		System.out.println(car.wheels);
		System.out.println(car1.wheels+" "+car1.color+" "+headlights);
	
			}

}
