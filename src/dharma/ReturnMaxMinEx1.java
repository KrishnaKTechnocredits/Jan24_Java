package dharma;

public class ReturnMaxMinEx1 {

	int maxNumOfArray(int[] arr) {
		int maxNum = arr[0];
		for(int index=0;index<arr.length;index++) {
			if(maxNum < arr[index]) {
				maxNum = arr[index];
			}
		}
		return maxNum;
	}
	
	int minNumOfArray(int[] arr) {
		int minNum = arr[0];
		for(int index=0;index<arr.length;index++) {
			if(minNum > arr[index]) {
				minNum = arr[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,50,60,30};
		ReturnMaxMinEx1 maxminex1 = new ReturnMaxMinEx1();
		System.out.println("max :" + maxminex1.maxNumOfArray(arr));
		System.out.println("min :" + maxminex1.minNumOfArray(arr));	
	}
}

