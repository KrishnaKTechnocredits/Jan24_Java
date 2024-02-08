package garima_s;

class FrequencyCharacter {
	void printCharacter(String value, char targetCharacter) {
		int count = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (ch == targetCharacter) {
				count++;
			}
		}
		System.out.println("frequency of "+ targetCharacter + " in " +value+ " is "+ count);
	}

	public static void main(String[] args) {
		FrequencyCharacter frequencyCharacter = new FrequencyCharacter();
		frequencyCharacter.printCharacter("technocredits", 't');
	}
}
