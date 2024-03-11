package hiral_purohit;
//Program 2 :  Find out last missing number from 1 to 10

public class Assignment_77_2 {
	void toGetlastMissingNum(int[] arr) {
		for (int i = 10; i >0; i--) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("last missing number is: " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new Assignment_77_2().toGetlastMissingNum(x);
	}

}
