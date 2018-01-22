package lesson10.lecture.annotation;

@BugReport(assignedTo="Bob", severity=1)
public class BadCode {
	
	public int add(int x, int y) {
		return x - y;
		
	}
}
