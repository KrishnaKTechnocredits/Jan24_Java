package suresh.array;

public class PrintNameFreqOfArry {

	int printFreqOfArry(String[] input, String targetstring) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == targetstring)
				count++;
			// System.out.println("count is"+count);
		} // System.out.println("count is"+count);
		return count;

	}

	void printnCountOfString(String[] input) {

		String str1 = "  ";
		for (int i = 0; i < input.length - 1; i++) {
			String str = input[i];
			int count = printFreqOfArry(input, str);
			str1 = str;
			if (count <= 1)
				System.out.println(count + str1);
			if (count > 1) {
				System.out.println(count + str1);

			}
		}

	}

	public static void main(String[] args) {
		String[] arry = { "techno", "credits", "samikash", "varsha", "techno" };
		new PrintNameFreqOfArry().printnCountOfString(arry);
	}
}
