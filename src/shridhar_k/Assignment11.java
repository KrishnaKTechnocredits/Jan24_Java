//On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
package shridhar_k;

public class Assignment11 {
	void numDivBy7_13(int strNum, int endNum) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int index=endNum; index>strNum; index--) {
			if(index%7==0 && index%13==0) {
				System.out.println();
				System.out.println(index + " is divisible by 13 & 7");
			}
			else if(index%7==0) {
				System.out.println();
				System.out.println(index + " is divisible by 7");
			}
			else if(index%13==0) {
				System.out.println();
				System.out.println(index + " is divisible by 13 ");
			}
		}
	}

	public static void main(String [] arg) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.numDivBy7_13(5, 40);
	}
}
