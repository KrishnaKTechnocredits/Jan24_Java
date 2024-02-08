package lovekesh_mishra;

class NamesFrequencyAssignment37 {

	int getStringCount(String[] val, String input) {
		int count = 0;
		for (int i = 0; i < val.length; i++) {
			String inp = val[i];
			if (inp == input) {
				count++;
			}
		}
		return count;
	}

	void printFrequency(String[] input) {
		int temp = 0;
		System.out.println("Frequency of input----> ");
		for (int i = 0; i < input.length; i++) {
			temp = getStringCount(input, input[i]);
			System.out.println(" " + input[i] + " = " + temp);
		}
	}

	public static void main(String[] args) {
		NamesFrequencyAssignment37 ans = new NamesFrequencyAssignment37();
		String[] input = { "techno", "credits", "samikash", "varsha", };
		ans.printFrequency(input);
	}
}