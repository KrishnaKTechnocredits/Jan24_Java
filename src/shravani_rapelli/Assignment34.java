package shravani_rapelli;

public class Assignment34 {
	
	int positiveDifference(int[] arr) {
		int sumEven = 0;
		int sumOdd = 0;
		int difference = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sumEven = sumEven + arr[index];

			} else {
				sumOdd = sumOdd + arr[index];
			}
		}
		System.out.println("Sum of Even Numbers : " + sumEven);
		System.out.println("Sum of Odd Numbers : " + sumOdd);
		if (sumEven > sumOdd) {
			difference = sumEven - sumOdd;

		} else {
			difference = sumOdd - sumEven;
		}
		System.out.println("Positive Difference between sum of Even Numbers and Odd Numbers : " + difference);
		return difference;
	}

	public static void main(String[] args) {
		int input[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new Assignment34().positiveDifference(input);
	}

}
