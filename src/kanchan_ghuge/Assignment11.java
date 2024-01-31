package kanchan_ghuge;

class Assignment11 {

	void printData(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + " is divisible by 3 and 5");
			}
		}
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printData(5, 40);
	}
}
