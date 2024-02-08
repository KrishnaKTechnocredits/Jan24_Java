package varsha;

public class ArrayEx3 {
	int sumEven = 0;
	int sumOdd = 0;
	int diff = 0;

	void printSumOfEvenOdd(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sumEven = sumEven + num[i];
			} else {
				sumOdd = sumOdd + num[i];
			}
		}
	}

	void printDiff() {
		if (sumEven > sumOdd) {
			diff = sumEven - sumOdd;
		} else {
			diff = sumOdd - sumEven;
		}
		System.out.println("Different between Sum of Odd and Even Number is : " + diff);
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		ArrayEx3 arrayEx3 = new ArrayEx3();
		arrayEx3.printSumOfEvenOdd(arr);
		arrayEx3.printDiff();

	}
}
