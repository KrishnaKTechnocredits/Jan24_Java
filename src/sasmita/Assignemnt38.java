package sasmita;

public class Assignemnt38 {

	void printMaxandMin(int[] str) {
		int max = 0;
		int min = str[0];
		for (int index = 0; index < str.length; index++) {
			if (max < str[index]) {
				max = str[index];
			}
			if (min >= str[index]) {
				min = str[index];
			}
		}
		System.out.println("max num in a given array :" + max);
		System.out.println("min num in a given array :" + min);
	}

	public static void main(String[] args) {
		int[] str = { 10, 20, 50, 60, 30 };
		new Assignemnt38().printMaxandMin(str);

	}
}
