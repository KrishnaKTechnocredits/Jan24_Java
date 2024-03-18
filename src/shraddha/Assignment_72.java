package shraddha;

public class Assignment_72 {
	int getMaxCount(String[] input) {
		int maxCount = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxCount) {
				maxCount = input[i].length();
			}
		}
		return maxCount;
	}

	String stringRightAligment(String str, int count) {
		String output = "";
		int requiredSpace = count - str.length();
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		return output + str;

	}

	String[] getDigit(String str) {
		String output = "";
		int sum = 0;
		String[] arr = new String[2];
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			} else
				output += str.charAt(i);
		}
		arr[0] = output;
		arr[1] = sum + "";
		return arr;

	}

	void sumOfDigit(String[] str) {
		String result = "";
		int total = 0;
		int count = getMaxCount(str);
		for (int i = 0; i < str.length; i++) {
			String[] input = getDigit(str[i]);
			String output = input[0];
			total = total + Integer.parseInt(input[1]);
			result = stringRightAligment(output, count);
			System.out.println(result);
		}
		String result1 = stringRightAligment(total + "", count);
		System.out.println(result1);
	}

	public static void main(String[] args) {

		Assignment_72 assignment_72 = new Assignment_72();
		String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
		String[] input1 = input.split(" ");
		assignment_72.sumOfDigit(input1);
	}
}
