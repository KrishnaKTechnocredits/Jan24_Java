package rohit_sutar;


//Class to find and print last even digit from the given string
public class LastEvenDigit {
	void findEvenDigit(String strInut){
		int evenDigit = 0;			//variable to store last even number from the string
		for(int i = 0; i <strInut.length() ; i++) {
			char ch = strInut.charAt(i);
			//to check received character is digit or not which is stored in "ch" 
			boolean isDigit = Character.isDigit(ch);
			if(isDigit){
				int digitInStr = Character.getNumericValue(ch);
				if(digitInStr % 2 == 0){
					evenDigit = digitInStr;
				}
			}
		}
		System.out.println("Last Even Digit in String is : "+evenDigit);
	}
	
	public static void main(String[] args) {
		new LastEvenDigit().findEvenDigit("te3ch4nocred86its7");
	}
}
