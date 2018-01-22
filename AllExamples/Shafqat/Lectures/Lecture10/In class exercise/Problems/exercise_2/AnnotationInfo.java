package lesson10.exercise_2;

public class AnnotationInfo {
	public static void main(String[] args) {
		System.out.println("Annotation on BadCode\n-----------------------");
		Class<BadCode> badCodeClass = BadCode.class;
		if (badCodeClass.isAnnotationPresent(BugReport.class)) {			 
			BugReport annotation = (BugReport)badCodeClass.getAnnotation(BugReport.class);			 
			System.out.printf("%nAssigned To : %s ", annotation.assignedTo());
			System.out.printf("%nSeverity : %d ", annotation.severity());
		}
		
		System.out.println("\n----------------------");
		System.out.println("\nAnnotation on MoreBadCode\n--------------------------");
		Class<MoreBadCode> moreBadCodeClass = MoreBadCode.class;
		if (moreBadCodeClass.isAnnotationPresent(BugReport.class)) {			 
			BugReport annotation = (BugReport)moreBadCodeClass.getAnnotation(BugReport.class);			 
			System.out.printf("%nAssigned To : %s ", annotation.assignedTo());
			System.out.printf("%nSeverity : %d ", annotation.severity());
		}

	}

}
