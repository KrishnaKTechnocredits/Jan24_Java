package ashwini_b;

/*
 Assignment - 15 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36

 */
public class NumDivBy34 {
	void printDivisibleBy34(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is : ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 4 == 0) {
				System.out.println(index);
				count += 1; // count++
				if (count >= 3) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		NumDivBy34 numDivBy34 = new NumDivBy34();
		numDivBy34.printDivisibleBy34(10, 500);
	}

}
