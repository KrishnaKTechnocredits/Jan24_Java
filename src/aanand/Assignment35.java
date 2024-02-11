package aanand;

public class Assignment35 {
	
	int sumOfEvenNumbers(int[] arr) {
		int sum =0;
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num % 2 == 0) {
				sum = sum + num;
			}
		}
		return sum;		
	}
	public static void main(String[] args) {
		int[] input = {3, 6, 9, 11, 15, 20, 4, 26};
		Assignment35 assignment35 = new Assignment35();
		int output = assignment35.sumOfEvenNumbers(input);
		System.out.println("Sum of even numbers: " + output);
	}
}
