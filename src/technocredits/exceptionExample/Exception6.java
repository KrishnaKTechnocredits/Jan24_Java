package technocredits.exceptionExample;

import java.io.FileNotFoundException;

public class Exception6 {
	
	void m1() throws FileNotFoundException{
		System.out.println(1);
	}
	
	void m2() throws FileNotFoundException{
		m1();
		System.out.println(2);
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		new Exception6().m2();
		System.out.println(3);
	}
}
