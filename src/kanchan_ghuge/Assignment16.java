package kanchan_ghuge;

class Assignment16 {

	void processNumbers(int startRange, int endRange) {
		int count = 0;
		int sum = 0;
		int avg = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				count++;
				sum = sum + num;
			}
		}
		avg = sum / count;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.processNumbers(1, 110);
	}
}