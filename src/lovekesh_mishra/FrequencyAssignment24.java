package lovekesh_mishra;

class FrequencyAssignment24 {

	void Print(String input) {

		for (int index = 1; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);

			}

		}

	}

	public static void main(String[] args) {
		FrequencyAssignment24 frequencyAssignment24 = new FrequencyAssignment24();
		frequencyAssignment24.Print("technocredits");
	}

}
