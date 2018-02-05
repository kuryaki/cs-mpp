package prob2;
import java.util.*;

/* Do Not Modify */
public class StringQueue {
	private LinkedList<String> list = new LinkedList<>();
	
	public void enqueue(String s) {
		list.addLast(s);
	}
	public void addAll(Collection<String> list) {
		if(list == null) return;
		list.forEach(x -> enqueue(x));
	}
	public String dequeue() throws EmptyQueueException {
		if(!isEmpty()) {
			return list.removeFirst();
		}
		else {
			throw new EmptyQueueException("Cannot remove an element since queue is empty");
		}
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public String peek() throws EmptyQueueException {
		if(!isEmpty()) {
			return list.getFirst();
		}
		else {
			throw new EmptyQueueException("Cannot look at an element since queue is empty");
		}
	}
	
}
