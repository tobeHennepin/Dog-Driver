/**
 * 
 * 
 * @author TOON001
 * Description: McDonalds Application
 *
 */
public class McDonalds {
	
	private boolean hasGoldenArches;
	private int storeNumber;
	private double annualEarnings;
	private String storeManagerName;
	private static int numStores = 0;
	
	
	public McDonalds(double earnings){
		hasGoldenArches = true;
		storeNumber = ++numStores;
		annualEarnings = earnings;
		storeManagerName = new String("Not Tobe");
	}
	
	public McDonalds(String name, double earnings) {
		storeManagerName = name;
		annualEarnings = earnings;
		storeNumber = ++numStores;

		
	}
	
	public McDonalds(boolean golden, double earnings, String name) {
		hasGoldenArches = golden;
		storeNumber = ++numStores;
		annualEarnings =earnings;
		storeManagerName = name;
	}
	
	
	public boolean equals(McDonalds other) {
		return this.storeNumber == other.storeNumber;
	}
	
	public double addEarnings(double amountToAdd) {
		annualEarnings += amountToAdd;
		return annualEarnings;
	}
	
	public boolean isGoldStore() {
		if (annualEarnings > 100000) {
			return true;
		}
		return false;
	}
	
	
	
	
	public boolean getHasGoldenArches() {
		return hasGoldenArches;
	}
	public int getStoreNumber() {
		return storeNumber;
	}
	
	public double getAnnualEarnings() {
		return annualEarnings;
	}
	
	public String getManagerName() {
		return storeManagerName;
	}
	
	public void setHasGoldenarches(boolean golden) {
		hasGoldenArches = golden;
	}
	
	public void setStoreNumber(int number) {
		storeNumber = number;
	}

	public void setAnnualEarnings(double earnings) {
		annualEarnings = earnings;
	}
	
	public void setManagerName(String name) {
		storeManagerName = name;
	}
	
	public String toString() {
		String temp = storeNumber + "\t" + storeManagerName + "\t" + annualEarnings;		
		return temp;
	}
	
}
