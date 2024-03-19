package shravani_rapelli;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment81 {

	int vowelsCount(String str) {
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				cnt++;
			}
		}
		return cnt;
	}
	
	void toGetMethod() throws IOException {
		File fl = new File(".//input.properties");
		FileInputStream inputStream = new FileInputStream(fl);
		Properties prop = new Properties();
		prop.load(inputStream);
		String str1 = prop.getProperty("str");
		int count = vowelsCount(str1);
		System.out.println(str1 + ": total number of vowels in string is " + count);
	}
	
	public static void main(String[] args) {
		try {
			new Assignment81().toGetMethod();
		}catch (IOException io) {
			System.out.println("File not found");
		}
	}
}
