package shraddha;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment_81 {

	int vowelCount(String str1) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'|| str1.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Assignment_81 assignment_81 = new Assignment_81();
		File file = new File(".//input.properties");
		FileInputStream input = new FileInputStream(file);
		Properties property = new Properties();
		property.load(input);
		String str1 = property.getProperty("str");
		int output = assignment_81.vowelCount(str1);
		System.out.println(str1 + " have " + output + " vowels");

	}
}
