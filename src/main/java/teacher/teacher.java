package teacher;

import student.student;

public class teacher {

	private String teacherName;
	private student student1;
	private student student2;
	
	public teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void setStudent1(student student1) {
		this.student1 = student1;
	}
	
	public void setStudent2(student student2) {
		this.student2 = student2;
	}
	
	public void showMessage() {
		System.out.println("My name is " + 
				this.teacherName+". My students are following:");
	}
	
	
	public void showTeachersStudent() {
		System.out.println(this.student1.toString());
		System.out.println(this.student2.toString());
	}

}
