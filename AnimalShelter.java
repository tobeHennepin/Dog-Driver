/**
 * 
 * 
 * @author TOON001 Project Name: Animal Shelter Desc: An application for the
 *         Animal shelter
 *
 */
public class AnimalShelter {

	private String shelteName;
	private Dog[] dog;
	private int numAnimals;
	private static int numShelters = 0;
	private int shelterId;

	// public AnimalShelter() {};

	public AnimalShelter(String name, int maxAnimals) {
		shelteName = name;
		dog = new Dog[maxAnimals];
		numAnimals = 0;
		numShelters++;
		shelterId = 123;
	}

	public boolean equals(AnimalShelter other) {
		return shelterId == other.shelterId;
	}

	public void addAnimal(Dog dogToAdd) {
		dog[numAnimals++] = dogToAdd;
	}

	public void addAnimal(boolean bullDog, int age, String name) {
		Dog dogToAdd = new Dog(true, 2, "shleby");
		addAnimal(dogToAdd);

	}

	public boolean contains(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return true;
			}
		}
		return false;

	}

	public int cageNumber(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public Dog minAge() {
		Dog min = dog[0];
		for (int i = 0; i < numAnimals; i++) {
			if (min.getAge() > dog[i].getAge()) {
				min = dog[i];
			}
		}
		return min;

	}

	public String getName() {
		return shelteName;
	}

	public int getNumAnimals() {
		return numAnimals;
	}

	public String toString() {
		String temp = "";
		temp += "Shelter Name is: " + shelteName + "\n";
		temp += "Name \t Age\n";
		temp += "************************************\n";
		for (int i = 0; i < numAnimals; i++) {
			temp += dog[i].getName() + "\t" + dog[i].getAge() + "\n";
		}

		return temp;
	}
}
