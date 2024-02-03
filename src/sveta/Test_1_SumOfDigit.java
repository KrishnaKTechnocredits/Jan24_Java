package sveta;

public class Test_1_SumOfDigit {

	public static void sumOfDigit(String str) {
		int sum=0;
		char ch = ' ';
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum+=Character.getNumericValue(ch);
				
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sumOfDigit("te3ch4nocred8its");
		sumOfDigit("technocredits");

	}

}
//6 min
