package lovekesh_mishra;

class GetEvenNumberTest2{
	int value;

	int getEvenNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean isflag = Character.isDigit(ch);
			input.lastIndexOf(ch);
			if (ch % 2 == 0) {
				if (isflag == true)
					value = Character.getNumericValue(ch);

			}

		}

		return value;

	}

	public static void main(String[] args) {
		GetEvenNumberTest2 test2 = new GetEvenNumberTest2();
		int value = test2.getEvenNumber("tec3hnoc2red7it6s4");
		System.out.println("Last even number in the string is ---> " + value);
	}
}
