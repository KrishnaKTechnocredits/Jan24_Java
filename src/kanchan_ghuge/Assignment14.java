package kanchan_ghuge;

class Assignment14 {

	void processData(int startIndex, int endIndex) {
		int count = 0;
		int sum = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.processData(10, 50);
	}
}
