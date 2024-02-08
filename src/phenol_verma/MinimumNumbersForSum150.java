package phenol_verma;

public class MinimumNumbersForSum150 {

	int count = 0;

	int countNum(int sum, int divNum) {
		int number = 1;
		int sum150 = 0;

		while (sum150 <= sum) {
			if (number % divNum == 0) {
				sum150 = sum150 + number;
				count++;
			}
			number++;
		}
		return count;
	}

	public static void main(String[] args) {
		MinimumNumbersForSum150 minimumNumbersForSum150 = new MinimumNumbersForSum150();
		int counter = minimumNumbersForSum150.countNum(150, 6);
		System.out.println("Minimum Numbers to Sum 150 is " + counter + " which is divisible by 6");
		
	}
}
