package HR.Management;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student extends Human implements Comparator<Student> {
	

	private int grade;
	
	public Student(){
		super();
		this.grade = 0;
	}
	
	public Student(String firstName, String lastName,int grade){
		super(firstName, lastName);
		this.grade = grade;
	}
	
	public int getGrade(){
		
		return this.grade;
	}
	
	
	
	
	
	public void showStudent(List<Student> student){
		Collections.sort(student, new Student());
		for(Student s : student){
			System.out.println(s);
		}
		System.out.println("\n");
		
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getGrade() < o2.getGrade()){
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName
				+ ", lastName=" + lastName + ", grade=" + grade + "]";
	}

}
