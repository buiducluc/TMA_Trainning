package Manager.School;

import java.util.List;

public class Student extends People{
	private String classNumber;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, List<Comment> listComment, String classNumber) {
		super(name, listComment);
		this.classNumber = classNumber;
		// TODO Auto-generated constructor stub
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return "Student [classNumber=" + classNumber + ", name=" + name
				+ ", listComment=" + listComment + "]";
	}
	

	
	
}
