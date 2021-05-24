/**
 * 
 * @author TOON001 Description: An Application that helps keep trcks of the dogs
 *         in an Animal shelter
 *
 */
public class Dog {

	private boolean isBullDog;
	private int age;
	private String dogName;
	private int id;
	private static int dogId = 0;

	/**
	 * Constructor based on the dogName and age
	 * 
	 * @param dogName
	 * @param age
	 */
	public Dog(String name, int age) {
		dogName = name;
		this.age = age;
		id = ++dogId;

	};

	/**
	 * Constructor based of if bullDog, age and dog name
	 * 
	 * @param bullDog
	 * @param age
	 * @param name
	 */
	public Dog(boolean bullDog, int age, String name) {
		isBullDog = bullDog;
		this.age = age;
		dogName = name;
		id = ++dogId;

	}

	/**
	 * equals method based on dog id
	 * @param other
	 * @return
	 */
	public boolean equals(Dog other) {
		return id == other.id;
	}

	/**
	 * getMethod for isBullDog
	 * @return
	 */
	public boolean getIsBullDog() {
		return isBullDog;
	}

	/**
	 * getAge method
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * getName method
	 * @return
	 */
	public String getName() {
		return dogName;
	}

	/**
	 * getId method
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * setIsBullDog method
	 * @param bullDog
	 */
	public void setIsBullDog(boolean bullDog) {
		isBullDog = bullDog;
	}

	/**
	 * setAge method
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * setName method
	 * @param name
	 */
	public void setName(String name) {
		this.dogName = name;
	}
	
	/**
	 * setId method
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * toString method for dogName and age
	 */
	public String toString() {
		String temp = "";
		temp += dogName + "\t" + age;
		return temp;
	}
}
