package shramika_vaidya;

public class SumOfEvenIndexNum {

	int getSumOfEvenIndex(int[] num) {
		int evenIndexSum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				evenIndexSum = evenIndexSum + num[i];
			}
		}
		System.out.println(evenIndexSum);
		return evenIndexSum;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		SumOfEvenIndexNum sumOfEvenIndexNum = new SumOfEvenIndexNum();
		sumOfEvenIndexNum.getSumOfEvenIndex(arr);
	}
}
