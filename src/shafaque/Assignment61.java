package shafaque;

public class Assignment61 {

	void printSumOfNegativeNo(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == '-') {
				char ch = str.charAt(index + 1);

				sum = sum + (Character.getNumericValue(ch) * (-1));
			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Assignment61 assi61 = new Assignment61();
		String str = "te-3ch4noc7red-8its";
		assi61.printSumOfNegativeNo(str);
	}

}
