package kanchan_ghuge;

class Assignment15 {

	void printNumber(int startIndex, int endIndex) {
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.printNumber(10, 500);
	}
}
