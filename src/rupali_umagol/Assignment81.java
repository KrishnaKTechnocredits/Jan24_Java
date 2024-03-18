//Read input from properties file and find out how many vowels are there in the input.
package rupali_umagol;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Assignment81 {

	int getVowelCount(String value) {
		int count = 0;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'a' || value.charAt(i) == 'e' || value.charAt(i) == 'i' || value.charAt(i) == 'o'
					|| value.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Assignment81 assignment81 = new Assignment81();
		File f = new File(".//input.properties");
		FileInputStream input = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(input);
		String value = prop.getProperty("str");
		int output = assignment81.getVowelCount(value);
		System.out.println(value + " -> " + output + " vowels.");

	}
}
