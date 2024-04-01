package ashwini_b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Read input from properties file and find out how many vowels are there in the input.
NOTE: i have already pushed input.properties file in the master branch. Please use the same file.
 */
public class Asgn81_ReadFromPropertyFile {
    int findVowelsCount(String str) {
    	int count = 0;
    	for(int i = 0; i < str.length();i++) {
    		char ch = str.charAt(i);
    		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
    			count++;
    		}
    	}
    	return count;
    }
    
    void getStringFromFile() throws IOException{
    	File file = new File(".//input.properties");
    	FileInputStream inputStream = new FileInputStream(file);
    	Properties property = new Properties();
    	property.load(inputStream);
    	String str1 = property.getProperty("str");
    	//System.out.println(str1);
    	int vowelCount = findVowelsCount(str1);
    	System.out.println("Vowels in String = " + vowelCount);
    }
	public static void main(String[] args) {
		Asgn81_ReadFromPropertyFile asgn81_ReadFromPropertyFile = new Asgn81_ReadFromPropertyFile();
		try {
			asgn81_ReadFromPropertyFile.getStringFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
