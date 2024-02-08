//Assignment - 36 : 4th Feb'2024

package puja_poreddiwar;

public class SumOfArrElementsDivBy3and5 {

	int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
	int sum = 0;
	int num = 0;

	void getSumOfArrayDivBy3and5() {
		System.out.println("Numbers which are divisible by 3 and 5");
		for (int index = 0; index < arr.length; index++) {
			num = (int) arr[index];
			if (num % 3 == 0 && num % 5 == 0) {
				sum = sum + num;
				System.out.println(num);
			}
		}
		System.out.println("Sum of all the numbers which are divisible by 3 and 5 is : " + sum);
	}

	public static void main(String[] args) {
		SumOfArrElementsDivBy3and5 sumof3and5 = new SumOfArrElementsDivBy3and5();
		sumof3and5.getSumOfArrayDivBy3and5();
	}
}
