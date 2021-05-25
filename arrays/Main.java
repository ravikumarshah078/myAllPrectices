package arrays;

public class Main {

	public static void main(String[] args) {
//		int[] number = new int[4];
//		System.out.println(Arrays.toString(number));
//		Arrays.sort(number);
//		System.out.println(number);
		
		Array array = new Array(2);
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.insert(50);
		System.out.println(array.indexOf(20)); 
		array.print();
	}

}
