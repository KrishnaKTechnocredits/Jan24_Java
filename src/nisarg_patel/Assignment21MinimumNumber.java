package nisarg_patel;

public class Assignment21MinimumNumber {

	int count = 1;

	void minimumNumber(int sum) {
		int sum1 = 0;
		int num = 1;
		while (sum1 <= 150) {
			if (num % 6 == 0) {
				sum1 = sum1 + num;
				count++;
			}
			num++;
		}
		System.out.println(count - 1);
	}

	public static void main(String[] args) {
		Assignment21MinimumNumber div = new Assignment21MinimumNumber();
		div.minimumNumber(150);
	}
}
