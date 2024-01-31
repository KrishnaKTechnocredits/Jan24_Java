package suresh;

public class DifferenceSumOfAllOddEven {
	int sum = 0;
	int sum1 = 0;
	String input="te3ch4noc7re9d8its";

	int sumOfOdd() {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				boolean flag2 = (Character.getNumericValue(ch) % 2 != 0);
				{
					if (flag2 == true) {
						sum = sum + Character.getNumericValue(ch);
					}

				}
			}
		}
		System.out.println("the sum of all the odd digits is "+sum);
		return sum; 
	}

	int sumOfEven() {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				boolean fl3 = (Character.getNumericValue(ch) % 2 == 0);
				{
					if (fl3 == true)
						sum1 = sum1 + Character.getNumericValue(ch);
				}

			}
		}
		System.out.println("the sum of all the even digits is "+sum1);
		return sum1;
	}

	void display() {
		System.out.println("the difference between sum of all the odd digits and even digits is "+ (sum - sum1));

	}

	public static void main(String[] Args) {
		DifferenceSumOfAllOddEven differenceSumOfAllOddEven = new DifferenceSumOfAllOddEven();
		differenceSumOfAllOddEven.sumOfOdd();
		differenceSumOfAllOddEven.sumOfEven();
		differenceSumOfAllOddEven.display();
	}
}
