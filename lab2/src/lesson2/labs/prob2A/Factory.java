package lesson2.labs.prob2A;

public class Factory {
	
	public static Student createStudent(String name) {
		Student student = new Student(name, null);
		GradeReport gradeReport = new GradeReport(student);
		student.setGradeReport(gradeReport);
		return student;
	};

	public static void main(String[] args) {
		
		Student behailu = createStudent("behailu");
		GradeReport behailuReport = behailu.getGradeReport();
		
		Student david = createStudent("david");
		GradeReport davidReport = david.getGradeReport();
	}

}
