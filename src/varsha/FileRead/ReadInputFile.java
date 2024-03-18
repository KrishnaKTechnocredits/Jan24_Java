package varsha.FileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Read input from properties file and find out how many vowels are there in the input.

public class ReadInputFile {

	static void readFileInput() throws IOException {
		File file = new File(".//input.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		String input = prop.getProperty("str");
		int count = getCountOfVowelInGivingString(input);
		System.out.println(input + " total number of vowel is : " + count);
	}

	static int getCountOfVowelInGivingString(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		readFileInput();
	}
}
