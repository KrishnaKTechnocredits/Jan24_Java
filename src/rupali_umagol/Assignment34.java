package rupali_umagol;

public class Assignment34 {
	int getEvenSum(int[] values) {
		int sumEven=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]%2==0) {
				sumEven=sumEven+values[i];
			}
		}
		return sumEven;
	}
	
	int getOddSum(int[] values) {
		int sumOdd=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]%2!=0) {
				sumOdd=sumOdd+values[i];
			}
		}
		return sumOdd;
	}
	
	public static void main(String[] args) {
		int total=0;
		Assignment34 assignment34=new Assignment34();
		int[] arr={30, 24, 19, 13, 36, 51, 11, 72};
		int evenResult=assignment34.getEvenSum(arr);
		System.out.println("Even values sum :" + evenResult);
		int oddResult=assignment34.getOddSum(arr);
		System.out.println("Odd values sum :" + oddResult);
		if(evenResult>oddResult) {
			total=evenResult-oddResult;
		}else {
			total=oddResult-evenResult;
		}
		System.out.println("Positive Differenece : "+total);
	}
}