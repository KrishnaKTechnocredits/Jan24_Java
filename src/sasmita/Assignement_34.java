package sasmita;

public class Assignement_34 {

	void diffBetweenEvenandOdd(int[] str) {
		int evensum = 0;
		int oddsum = 0;
		for (int index = 0; index < str.length; index++) {
			if (str[index] % 2 == 0)
				evensum = evensum + str[index];
			else
				oddsum = oddsum + str[index];
		}
		if (evensum > oddsum)
			System.out.println("positive diff. beetween even and odd number is :" + (evensum - oddsum));
		else
			System.out.println("positive diff. beetween odd and even number is :" + (oddsum - evensum));
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		Assignement_34 assignement_34 = new Assignement_34();
		assignement_34.diffBetweenEvenandOdd(arr);

	}
}
