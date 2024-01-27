//Find out the minimum numbers required to create sum 150, consider only those numbers which is divisible by 6.
package shridhar_k;

public class Assignment_21 {

	void sumOFNum(int reqSum, int divNum) {
		int counter = 0;
		int num = 1;
		int sum = 0;
		while (sum <= reqSum) {
			if (num % divNum == 0) {
				sum = sum + num;
				counter++;
			}
			num++;
		}
		System.out.println("output : " + counter);
	}

	public static void main(String[] arg) {
		Assignment_21 assignment_21 = new Assignment_21();
		assignment_21.sumOFNum(150, 6);
	}
}
