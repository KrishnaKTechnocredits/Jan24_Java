package ashwini_b;

/*
  Assignment - 9 : 21st Jan'2024
Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15

Output : Even numbers are:
10
12
14
*/
public class EvenNumber {
	void printEvenNumber(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println("Even number is: " + index);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.printEvenNumber(10, 15);
	}

}
