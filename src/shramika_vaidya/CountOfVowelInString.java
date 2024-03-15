package shramika_vaidya;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

public class CountOfVowelInString {

	int getVowelCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str = str.toLowerCase();
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	void readInput() throws IOException {
		File file = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String value = prop.getProperty("str");
		System.out.println(value);
		int count = getVowelCount(value);
		System.out.println("total vowels -> " + count);
	}

	public static void main(String[] args) throws IOException {
		CountOfVowelInString countOfVowelInString = new CountOfVowelInString();
		countOfVowelInString.readInput();
	}
}
