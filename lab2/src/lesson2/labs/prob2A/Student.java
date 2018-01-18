package lesson2.labs.prob2A;

public class Student {
	String name;
	GradeReport gradeReport;
	
	public Student(String name, GradeReport gradeReport) {
		this.name = name;
		this.gradeReport = gradeReport;
	}

	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
	public GradeReport getGradeReport() {
		return this.gradeReport;
	} 
}
