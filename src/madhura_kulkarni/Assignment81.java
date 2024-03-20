/*Assignment - 81 : 14th March'2024
Read input from properties file and find out how many vowels are there in the input.*/
package madhura_kulkarni;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Assignment81 {
	int getVowelsFromInputFile(String str) {
		int count = 0;
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Assignment81 ass = new Assignment81();
		File file = new File(".//input.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String str1 = prop.getProperty("str");
		int count = ass.getVowelsFromInputFile(str1);
		System.out.println("String in the input file is: " + str1);
		System.out.println("Total number of vowels in the String : " + count);

	}

}
