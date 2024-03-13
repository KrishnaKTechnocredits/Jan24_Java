
package rupali_umagol;

import java.util.Arrays;

public class ProgrammingTest4 {

	int[] getSumOfDividedArray(int[] num) {
		int[] num1 = new int[num.length / 2];
		int[] num2 = new int[num.length / 2];
		int[] result = new int[num.length / 2];
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			num1[i] = num[i];
			temp++;
		}
		for (int i = 0; i < num2.length; i++) {
			num2[i] = num[temp];
			temp++;
		}
		System.out.println("Devided Arrays : ");
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));

		for (int i = 0; i < num1.length; i++) {
			result[i] = num2[i] + num1[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] num = { 1, 10, 20, 12, 15, 6 };
		ProgrammingTest4 programming = new ProgrammingTest4();
		int[] sum = programming.getSumOfDividedArray(num);
		System.out.println("Sum of two Arrays : " + Arrays.toString(sum));
	}
}
