package aanand;

public class LastEvenNumOfString {

	void getLastEvenNumOfString(String str) {
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if(flag == true) {
				int digit = Character.getNumericValue(ch);
				if(digit % 2 == 0) {
					System.out.println(digit);
					break;
				}
			}
		}
	} 
	public static void main(String[] args) {
		LastEvenNumOfString lastEvenNumOfString = new LastEvenNumOfString();
		lastEvenNumOfString.getLastEvenNumOfString("te3ch4no6cred8it11s");
	}
}