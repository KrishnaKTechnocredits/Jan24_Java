//int [] arr = {10,5,2,10,5,8,9,10,6,8};
package akshay_gaikwad;

public class NotUniqueMemberArray {
	
	int getFreqFromArray(int [] arr, int num) {
		int count = 0;
		for(int numArr : arr) {
			if(num == numArr) {
				count++;
			}
		}
		return count;
	}
	
	void printNotUniqueNum(int [] arr) {
		for(int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if(getFreqFromArray(arr, num) != 1) {
				System.out.print(num + " ");
			}
			arr[index] = -1;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {10,5,2,10,5,8,9,6,8};
		new NotUniqueMemberArray().printNotUniqueNum(arr);
	}
}
