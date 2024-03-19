package garima_s;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CountVowelFromPropertyFile {

	void getMethod() throws IOException {
		File file = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(inputStream);
		String input = pr.getProperty("str");
		input = input.toLowerCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Numbers of vowels in a String : "+count);
	}

	public static void main(String[] args) {
		try {
			new CountVowelFromPropertyFile().getMethod();
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
	}
}
