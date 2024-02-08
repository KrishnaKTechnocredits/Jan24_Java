package prathamesh_tati;

// Programming Test 2 : WAP to print last even number from string -- > tec2h5n6oc8re9di11ts

class LastEvenNumber {
	void getLastEvenNumFromString(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);

				if (num % 2 == 0) {
					System.out.println("Last even number from String is " + num);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		LastEvenNumber lastEvenNumber = new LastEvenNumber();
		lastEvenNumber.getLastEvenNumFromString("tec2h5n6oc8re9di11ts");
	}
}