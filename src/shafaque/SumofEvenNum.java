package shafaque;

public class SumofEvenNum {

	int printEvensum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum = sum + num[i];

			}
		}
		System.out.println("The sum of Even number is " + sum);
		return sum;

	}

	public static void main(String[] args) {
		int[] num = { 3, 6, 9, 11, 15, 20, 4, 26 };
		new SumofEvenNum().printEvensum(num);
	}

}