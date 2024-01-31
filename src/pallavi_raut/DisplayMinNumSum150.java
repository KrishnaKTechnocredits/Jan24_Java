/*	Assignment - 21 : 27th Jan'2024

Find out the minimum numbers required to create sum 150, consider only those numbers which is divisible by 6.
output : 7
--------------------------------*/
package pallavi_raut;

public class DisplayMinNumSum150 {

	public static void main(String[] args) {
		DisplayMinNumSum150 minNum = new DisplayMinNumSum150();
		int endIndex = minNum.printMinNum(1);
		System.out.println("Minimum numbers required for the sum of 150 and divisible by 6 is " + endIndex);
	}

	int printMinNum(int endIndex) {
		int sum = 0, count = 0;
		while (sum <= 150) {
			if (endIndex % 6 == 0) {
				sum = sum + endIndex;
				count++;
			}
			endIndex++;
		}
		return count;
	}
}