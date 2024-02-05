/*
 * Assignment - 35 : 4th Feb'2024
PhenolV_Assignment_41
Return the sum of all the numbers which are divisible by 3 or 5.
input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both : 15+30 = 45
 */

package phenol_verma;

public class ArrSumOfDiv3And5 {
	void sumOf3And5Div(int arr[]) {
		int sumOf3And5 = 0;
		System.out.print("Number divided by 3 or 5 is {");

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 3 == 0 || arr[index] % 5 == 0) {
				sumOf3And5 = sumOf3And5 + arr[index];
				System.out.print(arr[index] + " ");
			}
		}
		System.out.println("}");
		System.out.println("Sum of number divided by 3 and 5 is " + sumOf3And5);
	}

	public static void main(String[] args) {
		ArrSumOfDiv3And5 arrSumOfDiv3And5 = new ArrSumOfDiv3And5();
		int arr[] = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		arrSumOfDiv3And5.sumOf3And5Div(arr);
	}
}
