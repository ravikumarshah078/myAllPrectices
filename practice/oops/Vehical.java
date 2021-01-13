package oops;

public class Vehical {

	int wheels;
	Vehical(int no){
		wheels=no;
	}
	public static void main(String[] args) {
		
		Vehical car=new Vehical(4);
		Vehical scooty=new Vehical(2);
		
		System.out.println("wheels in Car "+car.wheels);
		System.out.println("wheels in scooty "+scooty.wheels);
	}

}
