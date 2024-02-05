package rohini_deshmane;

public class SumOfNumberDivisibleByFiveOrThree {
	
	void printSum(int[] arr) {
		int sumOR=0, sumAnd=0;
		int sumDivThree =0, sumDivFive=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 ==0 || arr[i]%5==0) {
				sumOR = sumOR+arr[i];
			}
			if(arr[i]%3==0 && arr[i]%5 ==0) {
				sumAnd = sumAnd+arr[i];
			}
		}
		System.out.println("Sum Of Numbers which is divisible by 3 OR 5 = "+sumOR);
		System.out.println("Sum Of Numbers which is divisible by 3 OAND 5 = "+sumAnd);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3==0) {
				sumDivThree = sumDivThree+arr[i];
			} 
			if(arr[i]%5 ==0) {
				sumDivFive = sumDivFive +arr[i];
			}
		}
		System.out.println("Sum of divisible by 3 = "+sumDivThree);
		System.out.println("Sum of divisible by 5 = "+sumDivFive);

	}

	public static void main(String[] args) {
		SumOfNumberDivisibleByFiveOrThree sumOfNum = new SumOfNumberDivisibleByFiveOrThree();
		int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		sumOfNum.printSum(arr);
	}
}
