package string;

public class Anagrame {     

//  anagrame is when two string has the similar character and the no also same . eg cat and act

	public static void main(String[] args) {
		
		String a="cat";
		String b="act";
		 boolean isAnagrame=false;
		 
		 for(int i=0; i<a.length(); i++) {
			 
			 char c=a.charAt(i);
             	isAnagrame=false;
             	for(int j=0; j<b.length(); j++) {
             		if(b.charAt(j)==c) {
             			isAnagrame=true;
             			break;
             		}
             	}
             	
		
		 if(!isAnagrame) {
			 break;
		 }
		
	}

		 if(isAnagrame) {
			 System.out.println("Anagrame");
		 }else{
			 System.out.println("NOT Anagrame");
		 }
	}
}
