package kanchan_ghuge;

class Assignment9 {

	void printTemperature(int tempRange) { // done
		if (tempRange < -10) {
			System.out.println("Extreme Cold");
		} else if (tempRange >= -10 && tempRange <= 0) {
			System.out.println("Very Cold");
		} else if (tempRange >= 1 && tempRange <= 10) {
			System.out.println("Cold");
		} else if (tempRange >= 11 && tempRange <= 20) {
			System.out.println("Moderate");
		} else if (tempRange >= 21 && tempRange <= 30) {
			System.out.println("Warm");
		} else if (tempRange > 30) {
			System.out.println("Hot");
		}
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.printTemperature(-17);
		assignment9.printTemperature(-5);
		assignment9.printTemperature(4);
		assignment9.printTemperature(16);
		assignment9.printTemperature(21);
		assignment9.printTemperature(60);
	}
}