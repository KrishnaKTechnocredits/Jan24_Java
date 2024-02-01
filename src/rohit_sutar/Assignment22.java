package rohit_sutar;

public class Assignment22 {
	
	void findDigitInString(String strInput){
		int count = 0;
		int strLengh = strInput.length();
		System.out.println("Enter string lenght is : "+strLengh);
		
		for(int i = 0 ; i <= strLengh - 1 ; i++) {
			char ch = strInput.charAt(i);
			if(Character.isDigit(ch)){
				count++;
			}
		}
		System.out.println("Number of Digits Available in Given String : "+count);
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.findDigitInString("te3c3hn5o2cre3dits");
	}
}
