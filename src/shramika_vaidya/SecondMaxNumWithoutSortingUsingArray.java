package shramika_vaidya;

//95 part1
public class SecondMaxNumWithoutSortingUsingArray {

	void getSecondmaxNum(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			}
		}
		System.out.println("secondMax num -> " + secondMax);
		System.out.println("max num is-> " + max);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		new SecondMaxNumWithoutSortingUsingArray().getSecondmaxNum(arr);
	}
}
