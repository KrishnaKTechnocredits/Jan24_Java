package akshay_gaikwad;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	int getVowelCount(String str) {
		str = str.toLowerCase();
		int count = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String str1 = prop.getProperty("str");
		System.out.println(new ReadProperties().getVowelCount(str1));
		
	}
}
