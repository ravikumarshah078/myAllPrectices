package list;
import java.util.List;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// this type of arraylist is not in generiks and it is allowed the all data type in it;
//		ArrayList fruits=new ArrayList();
		
//		 below is the ArrayList of with the generiks and written in the < > b/w it is not giving the permission to any data type inspite of the given.
//		ArrayList<String> fruits=new ArrayList();
		
//		we can write this because array list inplements the list and list is used because list contains the all type of list.
		List<String> fruits=new ArrayList<>();
		
		List<String> vegetables =new ArrayList<>();
		
//		here's the add function that add the elements in array'
		vegetables.add("potato");
		vegetables.add("tomato");
		
		
		fruits.add("Apple");
//		int is not allowed in generiks if a ArrayList is generiks that it is not give the permission in the
//		ArrayList to enter the different data type in this.
//			  fruits.add(23);
		System.out.println(fruits);
		System.out.println(vegetables);
//		here while creatng the object of pair class(generik) class we can defined the value of X and Y and the data type of it.
//		the data type is written in the < b/w > is always starts with capital
		Pair<String , Integer> p1=new Pair<>("Rahul" , 234);
		Pair<Boolean , Float> p2=new Pair(false , 12.34);
		
		p1.get();
		p2.get();
		
	}

}
