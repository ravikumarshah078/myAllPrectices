package inheritance;

public class Singer extends Person{
	
	public void sing() {
		System.out.println(name+" can sing");
		
	}

	public void dance() {
		System.out.println(name+" can also dance");
	}
}
