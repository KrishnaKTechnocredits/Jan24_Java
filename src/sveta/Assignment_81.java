/*Assignment - 81 : 14th March'2024
Read input from properties file and find out how many vowels are there in the input.

NOTE: i have already pushed input.properties file in the master branch. Please use the same file.*/
package sveta;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment_81 {

	public void readInputString() throws Exception{
		File file = new File(".//input.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fileInputStream);
		String str1 = pr.getProperty("str");
		int no=0;
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
				no++;
			}
		}
		System.out.println("total no of Vowels is : "+no);
	}
	
	public static void main(String[] args) {
		try {
			new Assignment_81().readInputString();
		}catch(IOException e) {
			System.out.println("File Not Found");
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
