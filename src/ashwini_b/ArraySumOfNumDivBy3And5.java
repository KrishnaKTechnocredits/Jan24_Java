package ashwini_b;

/*
Assignment - 36 : 4th Feb'2024
Return the sum of all the numbers which are divisible by 3 or 5.
input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126
Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both : 15+30 = 45

 */
public class ArraySumOfNumDivBy3And5 {

	int sumOfNum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 || num[i] % 5 == 0) {
				sum = sum + num[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] inputarray = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		ArraySumOfNumDivBy3And5 arraySumOfNumDivBy3And5 = new ArraySumOfNumDivBy3And5();
		int sum = arraySumOfNumDivBy3And5.sumOfNum(inputarray);
		System.out.println(sum);
	}
}
