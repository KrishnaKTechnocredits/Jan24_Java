package lovekesh_mishra;

class NamesWithSumAssignment44 {

	boolean sumOfDigit(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int digitOfChar = Character.getNumericValue(ch);
			if (Character.isDigit(ch) == true) {
				sum = sum + digitOfChar;
			}

		} System.out.println(input + "-" + sum);
		return true;
	}
	
	void printInput(String[] input) {
		for(int i=0; i<input.length; i++) {
			sumOfDigit(input[i]);
		}
		
	}

	public static void main(String[] args) {
		NamesWithSumAssignment44 ans = new NamesWithSumAssignment44();
		String[] input = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n"};
		ans.printInput(input);
	}
}