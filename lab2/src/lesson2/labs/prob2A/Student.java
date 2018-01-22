package lesson2.labs.prob2A;

public class Student {
	String name;
	GradeReport gradeReport;
	
	Student(String name, GradeReport gradeReport) {
		this.name = name;
		this.gradeReport = gradeReport;
	}
	
	public Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}

	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
	public GradeReport getGradeReport() {
		return this.gradeReport;
	} 
}
