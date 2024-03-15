/*Read input from properties file and find out how many vowels are there in the input.

NOTE: i have already pushed input.properties file in the master branch. Please use the same file.
 * 
 */
package sasmita;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Assignment81 {
      int vowelsCount (String str) {
	  int count=0;
	    for(int i=0; i<str.length();i++) {
		char ch = str.charAt(i);
		str= str.toLowerCase();
		if(ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
		count++;
	}
	  return count;
	
}
    void read()throws Exception{
    	File file = new File(".//input.properties");
    	FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String value = prop.getProperty("str");
		System.out.println(value);
		int count = vowelsCount(value);
		System.out.println("total vowels -> " + count);
	}
    
	public static void main(String[] args) throws Exception {
		Assignment81 assignment81= new Assignment81();
		assignment81.read();

	}

}
