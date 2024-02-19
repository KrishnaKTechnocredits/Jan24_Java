package kanchan_ghuge;

/* Assignment - 31 : 4th Feb'2024
Write a program to find character having maximum frequency from given String.

input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters  */

class Assignment31 {

	int getCharFreqCount(String str, char character) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == character)
				count++;
		}
		return count;
	}

	void printAllCharFreq(String str) {
		int num = 0;
		char character = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = getCharFreqCount(str, ch);
			if (num < count) {
				num = count;
				character = ch;
			}
		}
		if (num == 1)
			System.out.println(str + " is having all Unique Characters");
		else
			System.out.println(str + " -> " + character + " ->" + num);
	}

	public static void main(String[] args) {
		new Assignment31().printAllCharFreq("aakanksha");
		new Assignment31().printAllCharFreq("teecccchnoceredites");
		new Assignment31().printAllCharFreq("maulik");
	}
}
