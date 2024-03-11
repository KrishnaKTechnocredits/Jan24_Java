package akshada_marne;

public class FindMissingNumFromArray {
	int num;

	int findAllMissingNumbers(int[] arr) {
		for (num = 1; num <= 10; num++) {
			boolean flag = false;

			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = true;
				}
			}
			if (flag == false)
				System.out.println(num);
		}
		return num;
	}

	int findFirstMissingNumFromArray(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println(num);
				break;
			}
		}
		return num;
	}

	int findLastMissingNumFromArray(int[] arr) {

		for (int num = 10; num >= 1; num--) {
			boolean flag = false;
			for (int i = arr.length - 1; i >= 0; i--) {
				if (num == arr[i]) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println(num);
				break;
			}
		}
		return num;
	}

	void display(int arr[]) {
		System.out.println("----All missing numbers in array------");
		findAllMissingNumbers(arr);
		System.out.println("----First missing number in array------");
		findFirstMissingNumFromArray(arr);
		System.out.println("----Last missing number in array-------");
		findLastMissingNumFromArray(arr);
	}

	public static void main(String args[]) {
		FindMissingNumFromArray findMissingNumFromArray = new FindMissingNumFromArray();
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		findMissingNumFromArray.display(arr);
	}

}
