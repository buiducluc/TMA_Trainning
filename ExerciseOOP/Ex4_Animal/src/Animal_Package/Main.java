package Animal_Package;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Animal> listDog = new ArrayList<Animal>();
		List<Animal> listCats = new ArrayList<Animal>();
		List<Animal> listFrog = new ArrayList<Animal>();

		
		listDog.add(new Dog("Baby", 4, "male")) ;
		listDog.add(new Dog("Win", 6, "male")) ;
		listDog.add(new Dog("Husky", 10, "female")) ;
		
		listCats.add(new Cats("Tom", 5, "male")) ;
		listCats.add(new Cats("Smile", 7, "female")) ;
		listCats.add(new Cats("Log", 6, "female")) ;
		
		listFrog.add(new Frog("BabyFrog", 9, "female")) ;
		listFrog.add(new Frog("FrogA", 8, "male"));
		listFrog.add(new Frog("Name", 7, "female")) ;
		
		System.out.println("\nList dog: " + listDog);
		System.out.println("\nList cats: " + listCats);
		System.out.println("\nList frog: " + listFrog);
		

		System.out.printf("\nThe Average of Dog is: "
				+ Animal.ageAverage(listDog));
		System.out.printf("\nThe Average of Cats is: "
				+ Animal.ageAverage(listCats));
		System.out.printf("\nThe Average of Frog is: "
				+ Animal.ageAverage(listFrog));

	}
}
