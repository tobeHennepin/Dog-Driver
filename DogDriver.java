import java.util.Scanner;

public class DogDriver {

	public static void main(String[] args) {

		// AnimalShelter main = new AnimalShelter();

		// Dog myDog = new Dog(false,3, "Chuck");
		// Dog yourDogLong = new Dog(true,2, "Bobby");
		Dog dog1 = new Dog("Chukky", 1);
		Dog dog2 = new Dog("Terry", 2);
		Dog dog3 = new Dog("Jack", 3);
		Dog dog4 = new Dog("Custo", 5);
		Dog dog5 = new Dog("Mark", 2);
		Dog dog6 = new Dog("Longo", 4);
		Dog dog7 = new Dog("Plies", 2);
		Dog dog8 = new Dog("Sugar", 3);

		// System.out.println(myDog.equals(yourDog));

		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter the name of your dog here: ");
		// String name = input.next();
		////
		// System.out.println("Enter the age of your dog here: ");
		// int age = input.nextInt();
		//
		// yourDog.setName(name);
		// yourDog.setAge(age);
		//
		// System.out.println("The name of your dog is " + myDog.getName() + " and age
		// is " + myDog.getAge());

		// System.out.println(myDog);

		AnimalShelter shelter = new AnimalShelter("Save a Pet", 10);

		shelter.addAnimal(dog1);
		shelter.addAnimal(dog2);
		shelter.addAnimal(dog3);
		shelter.addAnimal(dog4);

		System.out.println(shelter);

		System.out.println(shelter.contains(dog1));
		System.out.println(shelter.contains(dog5));

		System.out.println(shelter.minAge());
		System.out.println(shelter.cageNumber(dog2));

		AnimalShelter shelter2 = new AnimalShelter("Give to Pets", 12);
		shelter2.addAnimal(dog5);
		shelter2.addAnimal(dog6);
		shelter2.addAnimal(dog7);

		System.out.println(shelter2.contains(dog1));
		System.out.println(shelter2.contains(dog5));
		System.out.println(shelter2.contains(dog8));

		System.out.println(shelter2.minAge());
		System.out.println(shelter2.cageNumber(dog7));

	}

}
