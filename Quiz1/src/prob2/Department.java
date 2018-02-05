package prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	
	public StringQueue getQueue() {
		return queue;
	}
	
	public abstract String getName();
	
	public void addMessage(String message) {
		this.queue.enqueue(message);
	}
	
	public String nextMessage() {
		try {
			return this.queue.dequeue();
		} catch (EmptyQueueException e) {
			return null;
		}
	}
}
