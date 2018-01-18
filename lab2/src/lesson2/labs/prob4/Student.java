package lesson2.labs.prob4;

import java.util.*;

public class Student {
	private String name;
	private List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
	}
	
	public Student(String name) {
		this.name = name;
		this.grades = new ArrayList<TranscriptEntry>();
	}

	public String getName() {
		return name;
	}

	public List<TranscriptEntry> getGrades() {
		return grades;
	}

	public void addTranscriptEntry(TranscriptEntry transcriptEntry) {
		this.grades.add(transcriptEntry);
	}
	
}
