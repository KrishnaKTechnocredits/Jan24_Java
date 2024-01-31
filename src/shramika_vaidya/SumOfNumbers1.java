package shramika_vaidya;

class SumOfNumbers1 {

	void printSumOfNumbers(int finalsum) {
		int count = 0;
		int sum = 0;
		int num = 0;
		while (sum <= finalsum) {
			num++;
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			if (sum == 150)
				break;
		}
		System.out.println("Minimum Numbers Required = " + count);
	}

	public static void main(String[] args) {
		SumOfNumbers1 sumOfNumbers1 = new SumOfNumbers1();
		sumOfNumbers1.printSumOfNumbers(150);
	}
}
