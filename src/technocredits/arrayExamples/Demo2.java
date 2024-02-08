package technocredits.arrayExamples;

public class Demo2 {

	public static void main(String[] args) {
		int answer[] = getFirst10EvenNumbersInArray();
		for (int i = 0; i < answer.length; i++)
			System.out.println(answer[i]);
	}

	static int[] getFirst10EvenNumbersInArray() {
		int evenNumbers[] = new int[10];// 0-9
		int counter = 0;
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				evenNumbers[counter++] = i;
//				counter++;-
			}
		}
		return evenNumbers;
	}

}
