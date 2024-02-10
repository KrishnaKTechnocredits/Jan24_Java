package nikita_patil;

public class Assignment34 {
	public static void sumOperation(int[] arr) {
		int sumOfEven=0,sumOfOdd=0;
		char ch = ' ';
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2==0)
				sumOfEven +=arr[i];
			else 
				sumOfOdd+=arr[i];
		}
		System.out.println("sub of Odd no is "+sumOfOdd );
		System.out.println("sub of Even no is "+sumOfEven );
		if(sumOfOdd<sumOfEven) {
			System.out.println("Positive difference between odd and even no is : " + sumOfEven +  " - " + sumOfOdd + " -> "+(sumOfEven-sumOfOdd));
		}else {
			System.out.println(sumOfOdd-sumOfEven);
		}
	}
	public static void main(String[] args) {
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		sumOperation(arr);
	}
}

