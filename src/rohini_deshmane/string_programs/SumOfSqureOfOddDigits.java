package rohini_deshmane.string_programs;

/*
 * Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
 */
public class SumOfSqureOfOddDigits {
	
	void oddDigitSquare(String str){
		int sum=0;
		for(int i=0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				int num = Character.getNumericValue(str.charAt(i));
				if((num%2) != 0) {
					System.out.println(str.charAt(i) +" = "+num*num);
					sum = sum +(num*num);
				}
			}
		}
		
		System.out.println("Sum of Digit square "+sum);
	}
	
	public static void main(String[] args) {
		SumOfSqureOfOddDigits oddSqure = new SumOfSqureOfOddDigits();
		oddSqure.oddDigitSquare("te3ch4noc7red8its");
	}

}
