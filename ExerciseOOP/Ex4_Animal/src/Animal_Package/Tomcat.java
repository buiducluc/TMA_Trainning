package Animal_Package;

public class Tomcat extends Cats {
	public Tomcat() {
		super();
		this.sex = "Male";
	}

	public Tomcat(String name, int age, String sex) {
		this.name = "Tomcat";
		this.age = age;
		this.sex = "Male";
	}

	@Override
	public String toString() {
		return "Tomcat [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}
