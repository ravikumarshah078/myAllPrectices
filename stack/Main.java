package stack;

public class Main {

	public static void main(String[] args) {
//		String str = "hello";
//		
//		StringReverser reverse = new StringReverser();
//		var result = reverse.reverse(str);
//		System.out.println(result);
//		
//		String str1 = "(hhelo)";
//		Expression exp = new Expression();
//		var result1 = exp.isBalanced(str1);
//		System.out.println(result1);
		
		StackWithArrayList stack =new StackWithArrayList();
		stack.push(12);
		stack.push(22);
		stack.push(32);
		
		System.out.println(stack.peek());
		System.out.println(stack.toString());
	}

}
