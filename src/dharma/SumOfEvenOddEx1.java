package dharma;

public class SumOfEvenOddEx1 {

	int getEvenSum(int[] values) {
		int sumEven = 0;
		for(int i=0;i<values.length;i++) {
			if(values[i]%2 == 0) {
				sumEven = sumEven + values[i];
			}
		}
		return sumEven;
	}

	int getOddSum(int[] values) {
		int sumOdd = 0;
		for(int i=0;i<values.length;i++) {
			if(values[i]%2 != 0) {
				sumOdd = sumOdd + values[i];
			}
		}
		return sumOdd;
	}

	public static void main(String[] args) {
		int total = 0;
		SumOfEvenOddEx1 sumofevenoddex1 = new SumOfEvenOddEx1();
		int[] arr = {30, 24, 19, 13, 36, 51, 11, 72};
		int evenResult = sumofevenoddex1.getEvenSum(arr);
		System.out.println("Even sum is :" + evenResult);
		int oddResult = sumofevenoddex1.getOddSum(arr);
		System.out.println("Odd sum is :" + oddResult);
		if(evenResult > oddResult) {
			total = evenResult - oddResult;
		}else {
			total = oddResult - evenResult;
		}
		System.out.println( "Positive Differenece : "+total);
	}
}
