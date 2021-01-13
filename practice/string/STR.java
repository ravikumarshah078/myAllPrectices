package string;

public class STR {
	
	public static void main(String[] args) {
		
		String name="Ravi kumar";
		System.out.println(name.replace('R', 'L')); //for replace the word in the name;
		
		System.out.println(name.concat(" Kumar "));// for join the two different strings
		
		System.out.println(name.isEmpty());  	//to check the string is emoty or not
		
		String n[]=name.split(" ");
		for(String na:n) {
			System.out.println(na);
		}
		System.out.println(name.indexOf('k'));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(5));
		
		System.out.println(name.charAt(5));
	}


}
