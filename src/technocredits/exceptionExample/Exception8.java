package technocredits.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Thread.sleep();
public class Exception8 {
	
	void m1() throws IOException{
		File file = new File(".//imp.properties");
		FileInputStream inputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputStream);
		String value = prop.getProperty("username");
		System.out.println(value);
	}
	
	void m2() {
		System.out.println("In m2");
	}
	
	public static void main(String[] args) throws IOException,InterruptedException {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hi");
		Exception8 exception8 = new Exception8();
		exception8.m1();
		Thread.sleep(5000);
		exception8.m2();
	}
	
}
