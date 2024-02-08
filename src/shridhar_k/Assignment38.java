//Return the max & min number from given array.
package shridhar_k;

public class Assignment38 {
	
	int getMaxNum(int[] arr ) {
		int maxNum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
	
	int getMinNum(int[] arr ) {
		int minNum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		return minNum;		
	}

	void printMaxAndMinNum(int[] arrInp) {
		int maxNum = getMaxNum(arrInp);
		int minNum = getMinNum(arrInp);
		System.out.println("Output : min " + minNum + " max " + maxNum );
	}
	public static void main(String[] args) {
		int arr[] = {10,20,50,60,30};
		new Assignment38().printMaxAndMinNum(arr);
	}
}
