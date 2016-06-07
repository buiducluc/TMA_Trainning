package Animal_Package;

import java.util.List;

public class Animal {
	protected int age;
	protected String name;
	protected String sex;

	public Animal() {
		this.age = 0;
		this.name = null;
		this.sex = null;
	}

	public Animal(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public static int ageAverage(List<Animal> listAnimal) {
		int result = 0;
		for(Animal list : listAnimal){
			result += list.age;
		}
		return result / listAnimal.size();
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
}
