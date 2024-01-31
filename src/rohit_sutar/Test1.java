package rohit_sutar;

public class Test1 {
	
	void calculateDigit(String strInput) {
		int sum = 0;
		
		for(int i = 0 ; i < strInput.length() ; i++) {
			char currentChar = strInput.charAt(i);
			if(Character.isDigit(currentChar)) {
				sum = sum + Character.getNumericValue(currentChar);
			}
		}
		System.out.println("Addition of all digits in given String is : "+sum);
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.calculateDigit("te3ch4nocred8it");
		test1.calculateDigit("technocredit");
	}
}
