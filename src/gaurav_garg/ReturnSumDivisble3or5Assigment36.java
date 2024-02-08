package gaurav_garg;

public class ReturnSumDivisble3or5Assigment36 {

	int sum, sumdivide3and5, sumdivide3, sumdivide5;

	int getDisibleByThreeOrFive(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 == 0)
				sumdivide3and5 = sumdivide3and5 + arr[i];
			else if (arr[i] % 3 == 0)
				sumdivide3 = sumdivide3 + arr[i];
			else if (arr[i] % 5 == 0)
				sumdivide5 = sumdivide5 + arr[i];

		}
		sum = sumdivide3and5 + sumdivide3 + sumdivide5;
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		ReturnSumDivisble3or5Assigment36 returnSumDivisble3or5Assigment36 = new ReturnSumDivisble3or5Assigment36();
		int sum = returnSumDivisble3or5Assigment36.getDisibleByThreeOrFive(arr);
		System.out.print(sum);
	}
}
