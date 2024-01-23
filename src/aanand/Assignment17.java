package aanand;

public class Assignment17 {
	int count = 0;

	void frequencyOfChar(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " in " + str +" is: " + count);
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.frequencyOfChar("technocredits", 't');
	}
}
