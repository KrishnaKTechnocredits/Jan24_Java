/*
 * Write only one program having the following methods.

1. print all even numbers in a user defined range.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15

Output : Even numbers are:

10

12

14
 */

package shridhar_k;

public class Assignment9B {

	void printEvenNumber(int startNum, int endNum) {
		System.out.println("Even numbers between" + startNum + " and " + endNum +  " are: ");
		System.out.println("");
		for (int index = startNum; index <= endNum; index++) {
			if(index % 2 == 0) {
				System.out.println(index);
				System.out.println("");
			}
		}
	}
	
	 public static void main (String [] arg) {
		Assignment9B assignment9b = new Assignment9B();
		assignment9b.printEvenNumber(10, 15);
	}
}
