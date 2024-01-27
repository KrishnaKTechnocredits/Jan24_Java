package lovekesh_mishra;

class FrequencyAssignment19 {

	void countFrequency(String input, char character) {
		int count = 0;
		input = input.toLowerCase();
		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) == character) {
				count++;
			}
		}
		System.out.println("frequency of " + character + " in technocrediTs teaches Technology is " + count);
	}

	public static void main(String[] args) {
		FrequencyAssignment19 frequencyAssignment19 = new FrequencyAssignment19();
		frequencyAssignment19.countFrequency("technocrediTs teaches Technology", 't');
	}
}