package lovekesh_mishra;

class GetNumericValueTest1 {

	void numericValue(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);
			}

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		GetNumericValueTest1 getNumericValue = new GetNumericValueTest1();
		getNumericValue.numericValue("te3chn4nocred8its");
	}

}
