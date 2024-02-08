/*Print sum of all the odd digits in the given String.*/

package shraddha;

class PrintSumOfOddDigits{
	void printSum(String str){
		int sum =0;
		for (int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int temp = Character.getNumericValue(ch);
					if(temp%2!=0){
						sum = sum + temp;
					}
			}
		}
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String[] args){
		PrintSumOfOddDigits printSumOfOddDigits = new PrintSumOfOddDigits();
		printSumOfOddDigits.printSum("te3ch4noc7red8its");
		printSumOfOddDigits.printSum("te2chn6ocred8its");
	}
}