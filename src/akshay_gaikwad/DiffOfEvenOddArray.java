package akshay_gaikwad;

public class DiffOfEvenOddArray {
	int getDiffOfEvenOdd(int[] arr) {
		int evenNum = 0;
		int oddNum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 ==0) {
				evenNum += arr[index];
			} else {
				oddNum += arr[index];
			}
		}
		if (evenNum > oddNum) {
			return (evenNum - oddNum);
		} else {
			return (oddNum - evenNum);
		}
	}
	
	public static void main(String[] args) {
		int[] arr =  {30, 24, 19, 13, 36, 51, 11, 72};
		System.out.println(new DiffOfEvenOddArray().getDiffOfEvenOdd(arr));
	}
}
