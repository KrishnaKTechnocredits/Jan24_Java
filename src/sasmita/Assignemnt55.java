//"Print only characters occurring exactly twice:
//input: teecccchhhnno;
//output: en"
package sasmita;

public class Assignemnt55 {

	int getCountOfCharacter(String str, char targetcharacter) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetcharacter)
				count++;
		}
		return count;
	}

	void printOccurance(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int charcount = getCountOfCharacter(str, ch);
			if (charcount == 2) {
				if (str.indexOf(ch) == index) {
					System.out.print(ch);
				}
			}
		}

	}

	public static void main(String[] args) {
		Assignemnt55 assignment55 = new Assignemnt55();
		assignment55.printOccurance("teecccchhhnno");

	}

}
