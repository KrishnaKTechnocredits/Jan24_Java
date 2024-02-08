//Assignment - 37: 4th Feb'2024
package puja_poreddiwar;

public class NameFrequency {

	int getNameFrequency(String[] str, String input1) {
		int count = 0;
		for (int index = 0; index < str.length; index++) {
			String input2 = str[index];
			if (input1 == input2) {
				count++;
			}
		}
		return count;
	}

	void PrintFrequency(String[] names) {
		int temp = 0;
		System.out.println("Frequency of names in an Array : ");
		for (int index = 0; index < names.length - 1; index++) {
			temp = getNameFrequency(names, names[index]);
			System.out.println(names[index] + " = " + temp);
		}
	}

	public static void main(String[] args) {
		String[] names = { "techno", "credits", "samikash", "varsha", "techno" };
		new NameFrequency().PrintFrequency(names);
	}
}
