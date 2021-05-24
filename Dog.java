
public class Dog {

	private boolean isBullDog;
	private int age;
	private String name;
	private int id;
	private static int dogId = 0;

	public Dog(String dogName, int age) {
		name = dogName;
		this.age = age;
		id = ++dogId;

	};

	public Dog(boolean bullDog, int age, String name) {
		isBullDog = bullDog;
		this.age = age;
		this.name = name;
		id = ++dogId;

	}

	public boolean equals(Dog other) {
		return id == other.id;
	}

	public boolean getIsBullDog() {
		return isBullDog;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setIsBullDog(boolean bullDog) {
		isBullDog = bullDog;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		String temp = "";
		temp += name + "\t" + age;
		return temp;
	}
}
