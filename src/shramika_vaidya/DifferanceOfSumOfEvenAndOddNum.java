package shramika_vaidya;

public class DifferanceOfSumOfEvenAndOddNum {

	int getSumOfArray(int[] num) {
		int oddSum = 0;
		int evenSum = 0;
		int diff = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				evenSum = evenSum + num[i];
			} else if (num[i] % 2 != 0) {
				oddSum = oddSum + num[i];
			}
		}
		if (evenSum > oddSum) {
			diff = evenSum - oddSum;
		} else {
			diff = oddSum - evenSum;
		}
		System.out.println("differance is :-> " + evenSum + " - " + oddSum + " = " + diff);
		System.out.println("evenNumber sum is = " + evenSum);
		System.out.println("oddNumber sum is = " + oddSum);
		return diff;
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		DifferanceOfSumOfEvenAndOddNum differanceOfSumOfEvenAndOddNum = new DifferanceOfSumOfEvenAndOddNum();
		differanceOfSumOfEvenAndOddNum.getSumOfArray(arr);
	}
}
