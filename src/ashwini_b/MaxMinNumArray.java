package ashwini_b;

/*
Assignment - 38 : 4th Feb'2024
Return the max & min number from given array.
input : [10,20,50,60,30]
output : min : 10 max : 60
 */
public class MaxMinNumArray {

	int PrintMaxNumber(int[] num) {
		int maxnum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxnum) {
				maxnum = num[index];
			}
		}
		return maxnum;
	}

	int PrintMinNumber(int[] num) {
		int minnum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < minnum) {
				num[index] = minnum;
			}
		}
		return minnum;
	}

	public static void main(String[] args) {
		int[] numList = { 10, 20, 50, 60, 30 };
		MaxMinNumArray maxMinNumArray = new MaxMinNumArray();
		int max = maxMinNumArray.PrintMaxNumber(numList);
		int min = maxMinNumArray.PrintMinNumber(numList);

		System.out.println("Maxnum Num : " + max);
		System.out.println("Mininum Num : " + min);
	}

}
