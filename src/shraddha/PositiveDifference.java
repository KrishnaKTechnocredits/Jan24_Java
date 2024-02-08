package shraddha;

class PositiveDifference{
	void evenAndOddDifference(int[] arr){
		int evenSum=0;
		int oddSum=0;
		int totalDifference=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
		}
		if(evenSum>oddSum)
			totalDifference = evenSum-oddSum;
		else
			totalDifference = oddSum-evenSum;
			
		System.out.println("Difference between Odd and Even Numbers is: "+totalDifference);
	}
	
	public static void main(String[] args){
		PositiveDifference positive = new PositiveDifference();
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		positive.evenAndOddDifference(arr);
	}
}