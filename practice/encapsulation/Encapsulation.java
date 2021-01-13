package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.setAge(8);
		System.out.println(obj.getAge());
		
		obj.setName("ram");
		System.out.println(obj.getName());
	}

}
