package shramika_vaidya;

//95 part1 2nd
public class MaxNumFromArrayWithoutSorting {

	void getMaxNum(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max num is-> " + max);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		int[] arr1 = { 0, 0, 0, 2, 22, 3, 55, 66, 0, 0, 34, 26 };
		int[] arr2 = { 2, 22, 3, 55, 0, 0, 0, 34, 26 };
		int[] arr3 = { 2, 22, 3, 0, 0, 0, 0, 34, 26 };
		MaxNumFromArrayWithoutSorting maxNumFromArrayWithoutSorting = new MaxNumFromArrayWithoutSorting();
		maxNumFromArrayWithoutSorting.getMaxNum(arr);
		maxNumFromArrayWithoutSorting.getMaxNum(arr1);
		maxNumFromArrayWithoutSorting.getMaxNum(arr2);
		maxNumFromArrayWithoutSorting.getMaxNum(arr3);
	}
}
