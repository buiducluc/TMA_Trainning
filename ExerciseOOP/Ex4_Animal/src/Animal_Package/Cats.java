package Animal_Package;

public class Cats extends Animal implements ISound {
	@Override
	public String toString() {
		return "Cats [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

	int ageAverageCats;
	public Cats(){
		super();
		this.ageAverageCats = 0;
	}
	
	public Cats(String name, int age, String sex){
		this.age = age;
		this.name = name;
		this.sex = sex;		
	}
	public void animalSound(){
		System.out.printf("this is a cats");
	}
}
