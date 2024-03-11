package shramika_vaidya;

public class MissingNumberInArray2 {

	void AllMissingNum2(int[] arr1) {
		boolean flag = false;
		for (int num = 1; num <= 10; num++) {
			flag = false;
			for (int i = 0; i < arr1.length; i++) {
				if (num == arr1[i]) {
					flag = true;
				}
			}
			if (flag == false)
				System.out.println("Missing Number -> " + num);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		MissingNumberInArray2 missingNumberInArray2 = new MissingNumberInArray2();
		missingNumberInArray2.AllMissingNum2(arr);
	}
}
