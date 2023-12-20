package model;
import java.util.ArrayList;

public class Subjects {
	private ArrayList<Subject> subjects;
	
	public void Subject() {
		this.setSubjects(new ArrayList<>());
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
}
