package Animal_Package;

public class Dog extends Animal implements ISound{
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

	public Dog(){
		super();
		
	}
	
	public Dog(String name, int age, String sex){
		this.age = age;
		this.name = name;
		this.sex = sex;
		
	}
	public void animalSound(){
		System.out.printf("this is a dog");
	}
	
}
