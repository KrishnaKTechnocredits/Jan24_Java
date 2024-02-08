package rohini_deshmane;

public class ArrayEvenOddDifference {
	
	void printEvenOdd(int[] arr) {
		System.out.println("Even Numbers ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void getEventOffNumberDifference(int[] arr) {
		int diff=0;
		int[] array = arr;
		int eventSum=0, oddSum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 ==0) {
				eventSum = eventSum+arr[i];
			}
			else {
				oddSum = oddSum +arr[i];
			}
		}
		
		if(eventSum > oddSum) {
			diff = eventSum - oddSum;
		} else {
			diff = oddSum - eventSum;
		}
		printEvenOdd(array);
		System.out.println("\nDifference");
		System.out.println(eventSum +" - "+oddSum+" = "+diff);

	}
	
	public static void main(String[] args) {
		ArrayEvenOddDifference arryDiff = new ArrayEvenOddDifference();
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		arryDiff.getEventOffNumberDifference(arr);
	}

}
