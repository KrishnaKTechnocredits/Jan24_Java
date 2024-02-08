package samiksha;

public class DivArray {

	void printDivision(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 3 == 0) {
				sum = sum + num[index];
			} else if (num[index] % 5 == 0) {
				sum = sum + num[index];
			} else if (num[index] % 3 == 0 && num[index] % 5 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] input = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		new DivArray().printDivision(input);
	}
}
