package ankita_s;

public class Sumofallnumbers {
	int sum;
	int num;

	void printSumofallnumbers(int startindex, int endindex) {
		for (num = startindex; num <= endindex; num++) {
			if (num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
		}
		System.out.println("sum is " + sum);
	}

	public static void main(String[] args) {
		Sumofallnumbers sumofallnumber = new Sumofallnumbers();
		sumofallnumber.printSumofallnumbers(10, 50);
	}
}
