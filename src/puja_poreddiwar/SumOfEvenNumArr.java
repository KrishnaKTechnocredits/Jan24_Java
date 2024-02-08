//Assignment - 35 : 4th Feb'2024
package puja_poreddiwar;

public class SumOfEvenNumArr {

	int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
	int num = 0;
	int sumOfEven = 0;
	int sumOfodd = 0;
	int difference;

	void sumOfEvenEle() {
		for (int index = 0; index < arr.length; index++) {
			num = (int) arr[index];
			if (num % 2 == 0) {
				sumOfEven = sumOfEven + num;
			}
		}
		System.out.println("sum of all even numbers is: " + sumOfEven);
	}

	public static void main(String[] args) {
		SumOfEvenNumArr sumOfEvenNumArr = new SumOfEvenNumArr();
		sumOfEvenNumArr.sumOfEvenEle();
	}
}
