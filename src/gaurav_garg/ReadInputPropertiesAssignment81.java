/*
  Assignment - 81 : 14th March'2024
Read input from properties file and find out how many vowels are there in the input.
 */
package gaurav_garg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadInputPropertiesAssignment81 {

	void countVowelInString() throws IOException {
		File file = new File(".//input.properties");
		FileInputStream fs = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fs);
		String abc = pr.getProperty("str");
		int count = 0;
		for (int index = 0; index < abc.length(); index++) {
			char a = abc.charAt(index);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				count++;
			}
		}
		System.out.print("number of vowel in string -: " + count);
	} 

	public static void main(String[] args) {
		try {
			new ReadInputPropertiesAssignment81().countVowelInString();
		} catch (IOException e) {
			System.out.print("file not found");
		}
	}
}
