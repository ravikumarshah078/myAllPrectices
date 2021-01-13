package stack;
import java.util.*;

public class Balance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> Stack=new Stack<>();
		boolean isBalance=true;
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				Stack.push(ch);
				continue;
			}
			if(Stack.isEmpty()) {
				isBalance=false;
				break;
			}
			if(ch==')') {
				if(Stack.peek()=='(') {
					Stack.pop();
				}else {
					isBalance=false;
					break;
				}
			}
		    if(ch=='}') {
			if(Stack.peek()=='{') {
				Stack.pop();
			}else {
				isBalance=false;
				break;
			}
		
		}if(ch==']') {
			if(Stack.peek()=='[') {
				Stack.pop();
			}else {
				isBalance=false;
				break;
			}
		}
		}
		if(!Stack.isEmpty()) {
			isBalance=false;
		}
		if(isBalance) {
			System.out.println("Balance");
		}else {
			System.out.println("Not Balance");
		}
	}
}
