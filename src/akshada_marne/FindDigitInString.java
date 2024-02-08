package akshada_marne;

public class FindDigitInString {
	
	int count=0;
	
	void getDigitCount() {
		String str="te3c3hn5o2cre3dits";
		
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			boolean temp=Character.isDigit(ch);
			if(temp==true)
				count++;
		}
		System.out.println("Total digits available in te3c3hn5o2cre3dits are "+count);
	}
	
	public static void main(String args[]) {
		FindDigitInString findDigitInString = new FindDigitInString();
		findDigitInString.getDigitCount();
	}

}
