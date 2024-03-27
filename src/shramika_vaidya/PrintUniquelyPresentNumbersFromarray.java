package shramika_vaidya;

public class PrintUniquelyPresentNumbersFromarray {

	int getcount(int[] arr, int targetnum) {
		int count = 0;
		for (int num : arr) {
			if (targetnum == num) {
				count++;
			}
		}
		return count;
	}

	void getUniqueNum(int[] arr1) {
		int count = 0;
		for (int num1 : arr1) {
			count = getcount(arr1, num1);
			if (count == 1) {
				System.out.println(num1);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintUniquelyPresentNumbersFromarray().getUniqueNum(arr);
	}
}
