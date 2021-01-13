package interfaces;

public class FruitSeller implements Machanic, Fighter {
//	the class which is imple,enting the interfaces here's the all abstract methods are now initialized or says that it is override.

	public void fix() {
		
		System.out.println(name+" can fix the car and any machanical instrument.");
		
	}

	public void fight() {
		System.out.println(name1+" Can fight the all fights");
		
	}
	
	public void sell() {
		System.out.println("Fruit seller is now selling fruits");
	}
	
}
