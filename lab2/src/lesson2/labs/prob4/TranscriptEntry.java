package lesson2.labs.prob4;

class TranscriptEntry {
	private Student student;
	private Section section;
	private String grade;
	
	public String toString() {
		return "Student: " + student.getName() + "\n"
				+ "Course name: " + section.getCourseName() + "\n"
				+ "Section number: " + section.getSectionNumber() + "\n"
				+ "Grade: " + grade + "\n";
	}
	
	public TranscriptEntry(Student student, Section section, String grade) {
		this.student = student;
		this.section = section;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public Section getSection() {
		return section;
	}
	
	public String getGrade() {
		return grade;
	}
}
