package lesson2.labs.prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	Student bob = new Student();
	Student tim = new Student();
	Student allen = new Student();
	Student[] students = {bob, tim, allen};
	Section bio1 = new Section();
	Section bio2 = new Section();
	Section math = new Section();
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
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	private void readDataFromDb() {
		bob.name = "Bob";
		tim.name = "Tim";
		allen.name = "Allen";
		bio1.sectionNumber = 1;
		bio2.sectionNumber = 2;
		math.sectionNumber = 3;
		bio1.courseName = "Biology";
		bio2.courseName = "Biology";
		math.courseName = "Mathematics";
		
		TranscriptEntry[] entries =
			{new TranscriptEntry(), new TranscriptEntry(), new TranscriptEntry(),
				new TranscriptEntry(), new TranscriptEntry(), new TranscriptEntry()};
		entries[0].student = bob;
		entries[0].section = bio1;
		entries[0].grade = "A";
		
		entries[1].student = bob;
		entries[1].section = math;
		entries[1].grade = "B";
		
		entries[2].student = tim;
		entries[2].section = bio1;
		entries[2].grade = "B+";
		
		entries[3].student = tim;
		entries[3].section = math;
		entries[3].grade = "A-";
		
		entries[4].student = allen;
		entries[4].section = math;
		entries[4].grade = "B";
		
		entries[5].student = allen;
		entries[5].section = bio2;
		entries[5].grade = "B+";

		//insert entries into sections
		List<TranscriptEntry> gradesForBio1 = new ArrayList<>();
		gradesForBio1.add(entries[0]);
		gradesForBio1.add(entries[2]);
		bio1.gradeSheet = gradesForBio1;
		
		List<TranscriptEntry> gradesForBio2 = new ArrayList<>();
		gradesForBio2.add(entries[5]);
		bio2.gradeSheet = gradesForBio2;
		
		List<TranscriptEntry> gradesForMath = new ArrayList<>();
		gradesForMath.add(entries[1]);
		gradesForMath.add(entries[3]);
		gradesForMath.add(entries[4]);
		math.gradeSheet = gradesForMath;
		
		//insert entries into students
		List<TranscriptEntry> gradesForBob = new ArrayList<>();
		gradesForBob.add(entries[0]);
		gradesForBob.add(entries[1]);
		bob.grades = gradesForBob;
		
		List<TranscriptEntry> gradesForTim = new ArrayList<>();
		gradesForTim.add(entries[2]);
		gradesForTim.add(entries[3]);
		tim.grades = gradesForTim;
		
		List<TranscriptEntry> gradesForAllen = new ArrayList<>();
		gradesForAllen.add(entries[4]);
		gradesForAllen.add(entries[5]);
		allen.grades = gradesForAllen;
		
	}

}
