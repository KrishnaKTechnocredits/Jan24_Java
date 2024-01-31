package kanchan_ghuge;

class Assignment10 {

	void evenNumbers(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 2 == 0) {
				System.out.println(num + " is an even number");
			}
		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.evenNumbers(10, 15);
	}
}
