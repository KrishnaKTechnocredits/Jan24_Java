/*
 Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"
 */
package suresh.array;

public class Assignment62 {

	void getmovedSpeialCharToLast(String input) {
		String str1 = " ";
		String str2 = " ";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '-' || ch == '?' || ch == '!') {
				str1 = str1 + ch;

			} else {
				str2 = str2 + ch;
			}
		}
		System.out.println(str2 + str1);
	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		assignment62.getmovedSpeialCharToLast("-AasH?3v7i!");
	}
}
