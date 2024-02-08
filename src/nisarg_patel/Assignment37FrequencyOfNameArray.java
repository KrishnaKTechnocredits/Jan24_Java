package nisarg_patel;

public class Assignment37FrequencyOfNameArray {

	int getStringCount(String[] value, String input) {
		int count = 0;
		for (int index = 0; index < value.length; index++) {
			String input2 = value[index];
			if (input2 == input) {
				count++;
			}
		}
		return count;
	}

	void printFrequency(String[] names) {
		int temp = 0;
		System.out.println("Frequency of names in an Array : ");
		for (int index = 0; index < names.length; index++) {
			temp = getStringCount(names, names[index]);
			System.out.println(" " + names[index] + " = " + temp);
		}
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits", "samikash", "varsha", "techno" };
		new Assignment37FrequencyOfNameArray().printFrequency(input);
	}
}
