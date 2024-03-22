package dharma;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment_81 {

	int getVowelsFromFile(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	void getInputPropertyFile() throws IOException {

		File file = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String str1 = prop.getProperty("str");
		int count = getVowelsFromFile(str1);
		System.out.println("Total number of vowels in the String " + str1 + " : " + count);

	}

	public static void main(String[] args) {
		try {
			new Assignment_81().getInputPropertyFile();
		} catch (IOException e) {
			e.printStackTrace;
		}
		
	}
}
