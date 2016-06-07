package Manager.School;

import java.util.List;

public class Teacher extends People{
	Discipline discipline;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, List<Comment> listComment, Discipline discipline) {
		super(name, listComment);
		this.discipline = discipline;
		// TODO Auto-generated constructor stub
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	@Override
	public String toString() {
		return "Teacher [discipline=" + discipline + ", name=" + name
				+ ", listComment=" + listComment + "]";
	}
	
	
}
