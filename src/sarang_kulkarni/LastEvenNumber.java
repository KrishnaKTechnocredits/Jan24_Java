
/* Programming Test-2
 * Find last even number from given string
 * input string: te3ch4no6cred8it11s
 */
package sarang_kulkarni;

public class LastEvenNumber {
	
	void lastEvenNumber(String str) {
		for(int i= str.length()-1;i>=0;i--) {
			char ch= str.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				int digit= Character.getNumericValue(ch);
				if(digit % 2==0) {
					System.out.println("Last Even number in given string 'te3ch4no6cred8it11s' is = "+digit);
					break;
				}
			}
		}
	}
	public static void main(String [] args) {
		new LastEvenNumber().lastEvenNumber("te3ch4no6cred8it11s");
	}

}
