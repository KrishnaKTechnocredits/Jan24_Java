package gaurav_garg;

public class MissingNumberfrom1to10Assignment77 {

	void printArrayMissingNumber(int arr[]) {
		for (int j = 1; j <= 10; j++) {
			boolean flag = false;
			for (int i : arr) {
				if (i == j) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(j + " ");
			}
		}
	}

	void printArrayFirstMissingNumber(int arr[]) {
		for (int j = 1; j <= 10; j++) {
			boolean flag = false;
			for (int i : arr) {
				if (i == j) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(j + " ");
				break;
			}
		}
	}

	void printArrayLastMissingNumber(int arr[]) {
		for (int j = 10; j >= 1; j--) {
			boolean flag = false;
			for (int i : arr) {
				if (i == j) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(j + " ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new MissingNumberfrom1to10Assignment77().printArrayFirstMissingNumber(arr);
		new MissingNumberfrom1to10Assignment77().printArrayLastMissingNumber(arr);
		new MissingNumberfrom1to10Assignment77().printArrayMissingNumber(arr);
	}
}
