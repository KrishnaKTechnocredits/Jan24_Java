package shafaque;

import java.util.Arrays;

public class Assignment76 {

        static int[] getMaxNumArray(int[] arr1, int[] arr2) {
			int length = arr1.length > arr2.length ? arr1.length : arr2.length;
			int[] result = new int[length];
			for (int index = 0; index < result.length; index++) {
				result[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
			}
			return result;
		}

		static int[] getMinNumArray(int[] arr1, int[] arr2) {
			int length = arr1.length > arr2.length ? arr1.length : arr2.length;
			int[] result = new int[length];
			for (int index = 0; index < result.length; index++) {
				result[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
			}
			return result;
		}

		static int[] getConcatenateNumArray(int[] arr1, int[] arr2) {
			int length = arr1.length + arr2.length;
			int[] result = new int[length];
			int count = 0;
			for (int index = 0; index < arr1.length; index++) {
				result[count] = arr1[index];
				count++;
			}

			for (int index = 0; index < arr2.length; index++) {
				result[count] = arr2[index];
				count++;
			}
			return result;
		}

		static int[] getSumOfNumArray(int[] arr1, int[] arr2) {
			int length = arr1.length > arr2.length ? arr1.length : arr2.length;
			int[] result = new int[length];
			for (int index = 0; index < result.length; index++) {
				result[index] = arr1[index] + arr2[index];
			}
			Arrays.sort(result);
			return result;
		}

		public static void main(String[] args) {
			int[] arr1 = { 23, 34, 46, 67, 87 };
			int[] arr2 = { 65, 43, 78, 45, 90 };
			System.out.println("-----MaxNumArray-----");
			int[] output = Assignment76.getMaxNumArray(arr1, arr2);
			System.out.println(Arrays.toString(output));
			System.out.println("-----MinNumArray-----");
			int[] output1 = Assignment76.getMinNumArray(arr1, arr2);
			System.out.println(Arrays.toString(output1));
			System.out.println("-----ConcatenateNumArray-----");
			int[] output2 = Assignment76.getConcatenateNumArray(arr1, arr2);
			System.out.println(Arrays.toString(output2));
			System.out.println("-----SumOfNumArray-----");
			int[] output3 = Assignment76.getSumOfNumArray(arr1, arr2);
			System.out.println(Arrays.toString(output3));
		}
	}

