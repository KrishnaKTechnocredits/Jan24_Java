package technocredits.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCheckedException {
	
	void m1() {
		m2();
	}
	
	void m2() {
		File file = new File("D://phonel.txt");
		try {
			FileInputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("in catch");
		}
		System.out.println("all good");
	}
	
	
	public static void main(String[] args) {
		TestCheckedException checkedException = new TestCheckedException();
		checkedException.m1();
		
		try(Scanner sc1 =  new Scanner(System.in)) { // ARM
			String str = sc1.next(); // Technocredits
			System.out.println(str.charAt(7));
		}
		
	}
}
