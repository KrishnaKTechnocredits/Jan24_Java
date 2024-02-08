//Assignment - 34 : 4th Feb'2024
package puja_poreddiwar;

public class DiffOfEvenOddEle {

	int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
	int num = 0;
	int sumOfEven = 0;
	int sumOfodd = 0;
	int difference;

	void getDiffOfEvenandOddEle() {
		for (int index = 0; index < arr.length; index++) {
			num = (int) arr[index];
			if (num % 2 == 0) {
				sumOfEven = sumOfEven + num;
			} else {
				sumOfodd = sumOfodd + num;
			}
		}
		System.out.println("sum of all even numbers is: " + sumOfEven);
		System.out.println("sum of all odd numbers is: " + sumOfodd);
	}

	void printDifference() {
		difference = sumOfEven - sumOfodd;
		System.out.println("Difference between sum of all even numbers and odd numbers sum is: " + difference);
	}

	public static void main(String[] args) {
		DiffOfEvenOddEle diffOfEvenOddEle = new DiffOfEvenOddEle();
		diffOfEvenOddEle.getDiffOfEvenandOddEle();
		diffOfEvenOddEle.printDifference();
	}
}
