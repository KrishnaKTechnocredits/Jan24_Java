package technocredits.exceptionExample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception5 {
	
	void processData() throws FileNotFoundException, ClassNotFoundException{
		
	}
	
	void m1() throws ClassNotFoundException, FileNotFoundException, ArithmeticException{
		try {
			processData();
		}catch(FileNotFoundException fe) {
			
		}
		
	}
	
	void m2() throws ClassNotFoundException, FileNotFoundException {
		try {
			m1();
		} catch (ClassNotFoundException e) {
			//
		}catch(FileNotFoundException fe) {
			//
		}
		//
	}
}
