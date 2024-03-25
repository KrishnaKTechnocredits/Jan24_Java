package shramika_vaidya;

//85 part1
public class PrintDuplicatesUsingArray {
	int getcount(int[] arr, int targetnum) {
		int count = 0;
		for (int num : arr) {
			if (targetnum == num) {
				count++;
			}
		}
		return count;
	}

	boolean isNumProcessed(int[] arr, int targetnum, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnum == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void getDuplicatesNum(int[] arr1) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			count = getcount(arr1, arr1[i]);
			if (!isNumProcessed(arr1, arr1[i], i)) {
				if (count > 1) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintDuplicatesUsingArray().getDuplicatesNum(arr);
	}
}
