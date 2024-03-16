package hiral_purohit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment_81 {

	int toGetCountOfVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	void togetMethod() throws IOException {
		File file = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String str1 = prop.getProperty("str");
		int count = toGetCountOfVowel(str1);
		System.out.println(str1 + ": total number of vowels in String is " + count);
	}

	public static void main(String[] args) {
		try {
			new Assignment_81().togetMethod();
		} catch (IOException io) {
			System.out.println("File not found");
		}
	}

}
