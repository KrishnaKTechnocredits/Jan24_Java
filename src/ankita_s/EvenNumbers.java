package ankita_s;

public class EvenNumbers {

	void printEvenNumbers(int startindex, int endindex) {

		for (int num = startindex; num <= endindex; num++) {
			if (num % 2 == 0) {

				System.out.println(num);
			}
		}

	}

	public static void main(String[] agrs) {
		EvenNumbers evennumbers = new EvenNumbers();
		System.out.println("Below are the even numbers between 10 to 15");
		evennumbers.printEvenNumbers(10, 15);
	}

}
