package inheritance;


public class Main_Class {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		Singer s=new Singer();
		
		t.name="ram";
		t.teach();
		t.paly();
		System.out.println();
		s.name="Samy";
		s.sing();
		s.dance();
	

	}

}
