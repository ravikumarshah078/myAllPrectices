package queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//		Queue<Integer> queue = new ArrayDeque<>();
		PriorityQueue queue = new PriorityQueue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
//		reverse(queue);
		System.out.println(queue);
	}
//	QueueWithTwoStack queue = new QueueWithTwoStack();
//	queue.enqueue(10);
//	queue.enqueue(20);
//	queue.enqueue(30);
//	queue.dequeue();
//	System.out.println(queue.peek());
//
//	}
	
	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}

}
