package Manager.School;

import java.util.List;

public class Discipline {
	private String name;
	private String numberOfLectures;
	private String numberOfExercise;
	List<Comment> listCommnet;
	
	public Discipline(){
		
	}	
	
	public Discipline(String name, String numberOfLectures,
			String numberOfExercise, List<Comment> listCommnet) {
		this.name = name;
		this.numberOfLectures = numberOfLectures;
		this.numberOfExercise = numberOfExercise;
		this.listCommnet = listCommnet;
	}




	public List<Comment> getListCommnet() {
		return listCommnet;
	}

	public void setListCommnet(List<Comment> listCommnet) {
		this.listCommnet = listCommnet;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumberOfLectures() {
		return numberOfLectures;
	}
	public void setNumberOfLectures(String numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}
	public String getNumberOfExercise() {
		return numberOfExercise;
	}
	public void setNumberOfExercise(String numberOfExercise) {
		this.numberOfExercise = numberOfExercise;
	}

	@Override
	public String toString() {
		return "Discipline [name=" + name + ", numberOfLectures="
				+ numberOfLectures + ", numberOfExercise=" + numberOfExercise
				+ ", listCommnet=" + listCommnet + "]";
	}


	
}
