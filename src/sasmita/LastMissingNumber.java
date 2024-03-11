package sasmita;

public class LastMissingNumber {
	void getlastMissingNumber(int[] arr) {
	
		for (int num = 10; num >= 1; num--) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++)  {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("last missing number is " + num);
				break;
				
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new LastMissingNumber().getlastMissingNumber(arr);

	}

}

