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


	/**
	 * Constructor based on Shelter name and maxAnimals allowed in the shelter(added into array)
	 * @param name
	 * @param maxAnimals
	 */
	public AnimalShelter(String name, int maxAnimals) {
		shelteName = name;
		dog = new Dog[maxAnimals];
		numAnimals = 0;
		numShelters++;
		shelterId = 123;
	}

	/**
	 * method to find equals based on shelter id
	 * @param other
	 * @return
	 */
	public boolean equals(AnimalShelter other) {
		return shelterId == other.shelterId;
	}

	/**
	 * method to add a dog into the Animal Shelter array
	 * @param dogToAdd
	 */
	public void addAnimal(Dog dogToAdd) {
		dog[numAnimals++] = dogToAdd;
	}

	/**
	 * method to add a dog into Animal shelter based on parameters given
	 * @param bullDog
	 * @param age
	 * @param name
	 */
	public void addAnimal(boolean bullDog, int age, String name) {
		Dog dogToAdd = new Dog(true, 2, "shleby");
		addAnimal(dogToAdd);

	}

	/**
	 * contains method using linear search to find true if a dog is in this Animal shelter 
	 * @param target
	 * @return
	 */
	public boolean contains(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * method to find the array spot(cage number) where the dog can be found in an Animal Shelter
	 * @param target
	 * @return
	 */
	public int cageNumber(Dog target) {
		for (int i = 0; i < numAnimals; i++) {
			if (dog[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Dog class method to find the min age of the dogs in an Animal Shelter
	 * @return
	 */
	public Dog minAge() {
		Dog min = dog[0];
		for (int i = 0; i < numAnimals; i++) {
			if (min.getAge() > dog[i].getAge()) {
				min = dog[i];
			}
		}
		return min;

	}

	/**
	 * getName method
	 * @return
	 */
	public String getName() {
		return shelteName;
	}

	/**
	 * getNumAnimals method
	 * @return
	 */
	public int getNumAnimals() {
		return numAnimals;
	}

	/**
	 * toString method for Animal Shelter based on Dog toString
	 */
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
