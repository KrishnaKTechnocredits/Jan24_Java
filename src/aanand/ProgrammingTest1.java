package aanand;

public class ProgrammingTest1 {
	void getDigitSum(String str) {
		int sum =0;
	
		for(int i=0; i < str.length();i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if(flag==true) {
			sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}


	public static void main(String[] args) {
		ProgrammingTest1 programmingTest1 = new ProgrammingTest1();
		programmingTest1.getDigitSum("te3ch4nocred8its");
	}

}
