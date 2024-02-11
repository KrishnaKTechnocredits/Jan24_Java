package gaurav_garg;

public class ReturnSumEvenNumberInArrayAssigment35 {
	int sum;

	int sumEvenNumber(int arr1[]) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0)
				sum = sum + arr1[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 6, 9, 11, 15, 20, 4, 26 };
		ReturnSumEvenNumberInArrayAssigment35 returnSumEvenNumberInArrayAssigment35 = new ReturnSumEvenNumberInArrayAssigment35();
		int sum = returnSumEvenNumberInArrayAssigment35.sumEvenNumber(arr1);
		System.out.print(sum);
	}
}
