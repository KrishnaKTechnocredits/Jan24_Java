package phenol_verma;

public class First3NumDiv3And4 {
	int count = 0;

	void numberRange(int firstNum, int lastNum) {
		System.out.println("First 3 numbers divisible by 3 and 4 is");
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		First3NumDiv3And4 first3NumDiv3And4 = new First3NumDiv3And4();
		first3NumDiv3And4.numberRange(10, 500);
	}
}
