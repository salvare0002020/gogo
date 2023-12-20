package model;

public class Subject {
	private String subjectName;
	private String makeUser;
	
	public Subject(String subjectName,String makeUser) {
		this.subjectName= subjectName;
		this.makeUser = makeUser;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getMakeUser() {
		return makeUser;
	}
	public void setMakeUser(String makeUser) {
		this.makeUser = makeUser;
	}
	
	
}
