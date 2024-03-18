package akshada_marne;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesAndCheckVowelsCount {

	String readFile() throws IOException {

		File file = new File(".//input.properties");
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		String input = prop.getProperty("str");
		return input;
	}

	void getVowelsCount() throws IOException {
		String str = readFile();
		str = str.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.print("Total number of vowels in String " + str + " is "+ count);
	}

	public static void main(String args[]) {
		ReadPropertiesAndCheckVowelsCount readPropertiesAndCheckVowelsCount = new ReadPropertiesAndCheckVowelsCount();
		try {
			readPropertiesAndCheckVowelsCount.getVowelsCount();
		} catch (IOException ie) {
			System.out.println("File not found");
		}

	}
}
