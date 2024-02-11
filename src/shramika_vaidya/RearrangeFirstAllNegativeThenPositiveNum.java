package shramika_vaidya;

public class RearrangeFirstAllNegativeThenPositiveNum {

	void GetArrayPrinted(int[] array) {
		System.out.print("{");
		int[] output = new int[array.length];
		int j = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] < 0) {
				output[j] = array[index];
				j++;
			}
		}
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 0) {
				output[j] = array[index];
				j++;
			}
			System.out.print(output[index]);
			System.out.print(",");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		RearrangeFirstAllNegativeThenPositiveNum rearrangeFirstAllNegativeThenPositiveNum = new RearrangeFirstAllNegativeThenPositiveNum();
		rearrangeFirstAllNegativeThenPositiveNum.GetArrayPrinted(arr);
	}
}
