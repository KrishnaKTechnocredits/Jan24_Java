package rohini_deshmane.properties_file_reading;

import java.util.Properties;
import java.util.ResourceBundle;
import java.io.*;  
import java.util.*;  

public class ReadFromPropertyFile {
	
	int findVowelsCount(String str) {
		int count=0;
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='o' || str.charAt(i) =='i' || str.charAt(i) =='u')
				count++;
		}
		return count;
	}
	
	void getStringFromFile() throws IOException  {
		File file = new File(".//input.properties");
		FileInputStream inputstream = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(inputstream);
		String str1 = pro.getProperty("str");
		System.out.println(str1);
		int vowelCount = findVowelsCount(str1);
	    System.out.println("Vowels in String = "+vowelCount);
	}
	
	public static void main(String[] args) {
		ReadFromPropertyFile readFromPropertyFile = new ReadFromPropertyFile();
		try {
			readFromPropertyFile.getStringFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
