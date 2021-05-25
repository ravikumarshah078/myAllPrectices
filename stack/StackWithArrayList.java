package stack;

import java.util.ArrayList;
import java.util.List;

public class StackWithArrayList {
	
	private List<Integer> list = new ArrayList<>();
	private int count;
	
//	push
	public void push(int item) {
		list.add(item);
		count++;
	}
//  pop
	public int pop() {
		int pop = list.remove(--count);
		return pop;	
	}
//	peek
	public int peek() {
		int peek = list.get(--count);
		return peek;
	}
//	isEmpty
	public boolean isEmpty() {
		return list.isEmpty();
	}
//	to string
	@Override
	public String toString() {
		return list.toString();
	}

}
