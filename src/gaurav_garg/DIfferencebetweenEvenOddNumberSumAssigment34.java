package gaurav_garg;

public class DIfferencebetweenEvenOddNumberSumAssigment34 {

	int oddsum, evensum;

	void SumOddEvenNumberSum(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				evensum = evensum + array[i];
			else
				oddsum = oddsum + array[i];
		}
		if (evensum > oddsum)
			System.out.print(evensum - oddsum);
		else
			System.out.print(oddsum - evensum);
	}

	public static void main(String[] args) {
		int array[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new DIfferencebetweenEvenOddNumberSumAssigment34().SumOddEvenNumberSum(array);
	}
}
