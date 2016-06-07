package Animal_Package;

public class Frog extends Animal implements ISound {

	public Frog() {
		super();
	}

	public Frog(String name, int age, String sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;

	}

	public void animalSound() {
		System.out.printf("this is a ");
	}

	@Override
	public String toString() {
		return "Frog [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
}
