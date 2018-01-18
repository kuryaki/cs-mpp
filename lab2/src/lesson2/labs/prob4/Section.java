package lesson2.labs.prob4;

import java.util.*;

public class Section {

	private String courseName;
	private int sectionNumber;
	
	private List<TranscriptEntry> gradeSheet;
	
	public Section(int sectionNumber, String courseName) {
		this.sectionNumber = sectionNumber;
		this.courseName = courseName;
		this.gradeSheet = new ArrayList<TranscriptEntry>();
	}

	public int getSectionNumber() {
		return sectionNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}
	
	public void addTranscriptEntry(TranscriptEntry transcriptEntry) {
		this.gradeSheet.add(transcriptEntry);
	}
	
}
