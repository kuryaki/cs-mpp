package lesson2.labs.prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	
	Student bob;
	Student tim;
	Student allen;
	
	Student[] students;

	Section bio1;
	Section bio2;
	Section math;
	
	
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		System.out.println(m.getTranscript(m.bob));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.getGrades();
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.getSection().getCourseName());
		}
		return courseNames;
	}
	
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.getGradeSheet()) {
			grades.add(t.getGrade());
		}
		return grades;
	}
	
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
				
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.getGrades()) {
				if(!found) {
					if(te.getGrade().equals(grade)) {
						found = true;
						studentNames.add(s.getName());
					}
				}
			}
		}
		return studentNames;
	}
	
	private void newTranscriptEntry(Student student, Section section, String grade) {
		TranscriptEntry transcriptEntry = new TranscriptEntry(bob, bio1, "A");
		student.addTranscriptEntry(transcriptEntry);
		section.addTranscriptEntry(transcriptEntry);
	}
	
	private void readDataFromDb() {
		bob = new Student("Bob");
		tim = new Student("Tim");
		allen = new Student("Allen");
		
		students = new Student[] { bob, tim, allen };
		
		bio1 = new Section(1, "Biology");
		bio2 = new Section(2, "Biology");
		math = new Section(3, "Mathemathics");

		newTranscriptEntry(bob, bio1, "A");
		newTranscriptEntry(bob, math, "B");
		newTranscriptEntry(tim, bio1, "B+");
		newTranscriptEntry(tim, math, "A-"); 
		newTranscriptEntry(allen, math, "B"); 
		newTranscriptEntry(allen, bio2, "B+");	
	}

}
