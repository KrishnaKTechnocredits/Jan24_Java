package samiksha;

public class SpecialCh {

	void printString(String str) {
		for(int index = 0; index< str.length(); index++) {
			char ch= str.charAt(index);
			if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
				System.out.println(str);
				break;
			}
		}	
	}
	
	void printSpecialChFromArray(String[] arr) {
		for(int index=0; index<arr.length;index++) {
			String temp=arr[index];
			printString(temp);
		}
	}
		
	public static void main(String[] args) {
		String[] input = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new SpecialCh().printSpecialChFromArray(input);
	}
}
