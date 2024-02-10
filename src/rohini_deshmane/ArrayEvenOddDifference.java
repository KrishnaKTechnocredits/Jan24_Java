package rohini_deshmane;

public class ArrayEvenOddDifference {
	static int eventSum, oddSum;
	
	void printEvenOdd(int[] arr) {
		System.out.println("Even Numbers ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				eventSum = eventSum+arr[i];
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				oddSum = oddSum +arr[i];
				System.out.println(arr[i]);
			}
		}
	}
	
	void getEventOffNumberDifference(int[] arr) {
		int diff;
		int[] array = arr;
		printEvenOdd(array);
		if(eventSum > oddSum) {
			diff = ArrayEvenOddDifference.eventSum - ArrayEvenOddDifference.oddSum;
		} else {
			diff = ArrayEvenOddDifference.oddSum - ArrayEvenOddDifference.eventSum;
		}
		System.out.println("\nDifference \n"+ArrayEvenOddDifference.eventSum +" - "+ArrayEvenOddDifference.oddSum+" = "+diff);		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayEvenOddDifference arryDiff = new ArrayEvenOddDifference();
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		arryDiff.getEventOffNumberDifference(arr);
	}

}
