//int[] x = {2,4,1,5,6,9,8,10};

package akshay_gaikwad;

public class MissingNumber {

	void printMissingNum(int[] arr) {
		for (int i = 1; i < 10; i++) {
			boolean flag = false;
			for (int num : arr) {
				if (num == i) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(i + " ");
			}
		}
	}
	
	void printLastMissingNum(int[] arr) {
		for(int i = 10; i > 0; i--) {
			boolean flag = false;
			for(int j : arr) {
				if(j == i) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(i);
				break;
			}
		}
	}
	
	void printFirstMissingNum(int[] arr) {
		for (int i = 1; i < 10; i++) {
			boolean flag = false;
			for (int num : arr) {
				if (num == i) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(i + " ");
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] x = {2,4,1,5,6,9,8,10};
		MissingNumber obj = new MissingNumber();
		System.out.print("All missing numbers from array : ");
		obj.printMissingNum(x);
		System.out.println();
		System.out.print("First missing numbers from array : ");
		obj.printFirstMissingNum(x);
		System.out.println();
		System.out.print("Last missing numbers from array : ");
		obj.printLastMissingNum(x);
		System.out.println();
	}
}
