package lesson2.labs.prob4;
import java.util.*;
public class Transcript {
	private Student student;
	private List<TranscriptEntry> entries = new ArrayList<>();
	public Transcript(List<TranscriptEntry> entries, Student student) {
		this.student = student;
		this.entries = entries;
	}
	/** Formatted report */
	public String toString()  {
		if(entries.isEmpty()) return "No data";
		StringBuilder sb = new StringBuilder("Transcript for ");
		Student student = entries.get(0).student;
		sb.append(student.name + ": ");
		sb.append("\n\n");
		int len = "Course Name          Grade".length();
		sb.append(" Section Number    Course Name          Grade\n");
		for(TranscriptEntry te : entries) {
			sb.append(sp(5) + te.section.sectionNumber    
					+ sp(15) + te.section.courseName 
					+ sp(len - te.section.courseName.length()-6) + te.grade);
			sb.append("\n");
		}
		return sb.toString();			
		
	}
	public Student getStudent() {
		return student;
	}
	private String sp(int k) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < k; ++i) {
			sb.append(" ");
		}
		return sb.toString();
	}
}
