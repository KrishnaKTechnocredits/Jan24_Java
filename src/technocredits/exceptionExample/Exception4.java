package technocredits.exceptionExample;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import technocredits.p1.Student;

public class Exception4 {

	static int m1(int y) {
		try {
			int x = 10 / y;
			System.out.println(x);
		} catch (NullPointerException ne) {
			System.out.println(1);
		} finally {
			System.out.println("In finally");
			int x = 10 / 0;
			System.out.println(x);
			System.out.println("techno");
			return 10;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		//int ans = Exception4.m1(0);
		//System.out.println(ans);

		try {
			int x = 10/0;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
