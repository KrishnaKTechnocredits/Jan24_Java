/*Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"*/
package madhura_kulkarni;

public class Assignment59 {
	int getCharFreq(String str1, char ch1) {
		str1 = str1.toLowerCase();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch1)
				count++;
		}
		return count;
	}

	void printCharWithMaxFreq(String input) {
		int maxCount = 0;
		char target = ' ';
		for (int i = 0; i < input.length(); i++) {
			int count = getCharFreq(input, input.charAt(i));
			if (maxCount < count) {
				maxCount = count;
				target = input.charAt(i);
			}
		}
		System.out.println("Character with max count is: " + target + "->" + maxCount);
	}

	public static void main(String[] args) {
		String str = "TeeCccChH";
		new Assignment59().printCharWithMaxFreq(str);
	}

}
