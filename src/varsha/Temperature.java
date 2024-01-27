package varsha;

public class Temperature {
	
	void printTempInfo(int tempIndex) {
		if(tempIndex < -10) {
			System.out.println("It is Extreme Cold");
		} else if(tempIndex <= 0 && tempIndex >= -10) {
			System.out.println("It is Very Cold");
		} else if(tempIndex <= 10 && tempIndex >= 1) {
			System.out.println("It is Cold");
		} else if(tempIndex <= 20 && tempIndex >= 11) {
			System.out.println("It is Moderate");
		} else if(tempIndex <= 30 && tempIndex >= 21) {
			System.out.println("It is Warm");
		} else {
			System.out.println("It is Hot");
		}
	}

	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		temperature.printTempInfo(-12);
		temperature.printTempInfo(8);
		temperature.printTempInfo(15);
		temperature.printTempInfo(27);
		temperature.printTempInfo(40);
	}
}
