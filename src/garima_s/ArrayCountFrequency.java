package garima_s;

public class ArrayCountFrequency {

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

	boolean isStringProcessed(String[] name, String targetInput, int targetindex) {
		for (int index = 0; index < targetindex; index++) {
			if (name[index].equals(targetInput)) {
				return true;
			}
		}
		return false;
	}

	void printFrequency(String[] names) {
		int temp = 0;
		String str = "";
		System.out.println("Frequency of names in an Array : ");
		for (int index = 0; index < names.length; index++) {
			str = names[index];
			if (!isStringProcessed(names, str, index)) {
				temp = getStringCount(names, names[index]);
				System.out.println(" " + names[index] + " = " + temp);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits", "samikash", "varsha", "techno" };
		new ArrayCountFrequency().printFrequency(input);
		
	}
}
