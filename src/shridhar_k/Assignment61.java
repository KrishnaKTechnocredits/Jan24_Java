/*
 * "Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */
package shridhar_k;

public class Assignment61 {
	
	int getSumOfNegariveValue(String word) {
		int output = 0;
		char ch = ' ';
		for(int i =0; i < word.length(); i++) {
			if(word.charAt(i) == '-') {
				if(Character.isDigit(word.charAt(i+1)))
					output = output + Character.getNumericValue(word.charAt(i+1));
			}
		}
		output = output * -1;
		return output;
	}
	
	public static void main(String[] args) {
		String input = "te-3ch4noc7red-8its";
		System.out.println(new Assignment61().getSumOfNegariveValue(input)); 
	}

}
