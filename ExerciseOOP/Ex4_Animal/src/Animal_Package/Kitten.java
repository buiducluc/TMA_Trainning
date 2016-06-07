package Animal_Package;

public class Kitten extends Cats {
	public Kitten() {
		super();
		this.sex = "Female";
	}

	public Kitten(String name, int age, String sex) {
		this.name = "Kitten";
		this.age = age;
		this.sex = "Female";
	}

	@Override
	public String toString() {
		return "Kitten [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
