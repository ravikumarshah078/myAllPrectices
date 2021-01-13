package list;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static void main(String[] args) {
		
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("grapes");
//		add method is the simple add that add any value to the arraylist;
		List<String> vegetables =new ArrayList<>();
		vegetables.add("potato");
		vegetables.add("tomato");
		vegetables.add("peas");
		
//		addAll methods in java ArrayList add the two list and added to the one. in this vegetable add in fruits.
		
		//fruits.addAll(vegetables);
//		System.out.println(fruits);
		
//		get.(index) this return the value that are present in the index value and 
//		it also return the out of index if the value is out of the range
//		System.out.println(fruits.get(2));
		
//		set(index, value) this is basically the method of changing the value at the index value.
		//fruits.set(1,"guava"); //it sets or says changes the value of mango to guava;
//		System.out.println(fruits);
		
//		remove(index) this method is used to remove the element in the array list to that index value;
		//fruits.remove(3); // this remove method is remove the value of index 3 .
//		System.out.println(fruits);
		
//		removeAll()  this method is remove all the value in the arraylist;
//		above the is the method of add and the remove is work the opposit to this method;
		//fruits.removeAll(vegetables); //it remove the value of vegetables in the fruits arraylist
//		System.out.println(fruits);
		
//		clear() this is clear the entire arraylist of the given;
		//fruits.clear(); //it clears tha all value present in the fruits arraylist;
//		System.out.println(fruits);
		
//		size() it returns the size of the arraylist is like the a.length method;
		//System.out.println(fruits.size()); //it returns 4 that is the current size of the arraylist;
		
//		contains() it returns the value in boolean that is the value in the arraylist is available or not;
//		System.out.println(fruits.contains("orange")); //retuens true because the orange is available in the arraylist;
		
//		isEmpty() it is return boolean value that is the present arraylist is empty or not;
//		System.out.println(fruits.isEmpty());// it return false because the arraylist is not empty;
		
//		toArray() it returns the objects of the array...????
		
		String temp[]=new String[fruits.size()];
		
		fruits.toArray(temp); //it returns the value of the arraylist one by one.
		for (String e:temp) {
			System.out.println(e);
		}
	}
}


