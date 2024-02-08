package kanchan_ghuge;

class Assignment13 {

	void printData(int startRange, int endRange) {
		int i = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 9 == 0) {
				i = num;
			}
		}
		System.out.println(i + " is divisible by 5 and 9");
	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.printData(5, 100);
	}
}
