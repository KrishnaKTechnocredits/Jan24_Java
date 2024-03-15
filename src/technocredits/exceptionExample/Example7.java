package technocredits.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example7 {

	
	synchronized void m1() throws FileNotFoundException{
		File f = new File("D://Jan24.txt");
		FileInputStream inputStream = new FileInputStream(f);
		System.out.println("Hi");
	}
	
	void m2() throws FileNotFoundException{
		System.out.println("Hello");
		try {
			m1();
		}catch(FileNotFoundException fe) {
			System.out.println("Techno");
			File f = new File("D://Jan24.txt");
			FileInputStream inputStream = new FileInputStream(f);
		}catch(Throwable io) {
			System.out.println("Credits");
		}
	}
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		try {
			example7.m2();
		} catch(NullPointerException fe) {
			System.out.println("Pune");
		}catch(Throwable e) {
			System.out.println("India");
		}
	}
}
