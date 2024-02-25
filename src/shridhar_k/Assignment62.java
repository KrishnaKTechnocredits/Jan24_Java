/*
 * "Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"
 */

package shridhar_k;

public class Assignment62 {
	
	void getDecimalNumericValue(String word) {
		double sum = 0;
		for(int i =1 ; i<word.length() ; i++) {
			if(word.charAt(i) == '.' && Character.isDigit(word.charAt(i - 1)) && Character.isDigit(word.charAt(i + 1))) {
				int num1 = Character.getNumericValue(word.charAt(i-1));
				double num2 = Character.getNumericValue(word.charAt(i+1));
				sum = sum + (num1 +  num2 *0.1);
			}else if(Character.isDigit(word.charAt(i)) &&  word.charAt(i-1) != '.' && word.charAt(i +1 ) != '.' ) {
				int num1 = Character.getNumericValue(word.charAt(i));
				
				sum = sum + num1 ;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String inpStr = "te3ch4.5noc7red8.1its";
		new Assignment62().getDecimalNumericValue(inpStr);
	}
}
