package akshada_marne;

public class SumOfOddEvenDigitsInString {
	
	

	void calculateSumOfOdd(String str) {
		
		int sumodd=0;
		int sumeven=0;
		
		for (int index = 0; index < str.length(); index++) {
			
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			int num = Character.getNumericValue(ch);
			if (flag == true && num % 2 != 0) {
				sumodd = sumodd + num;
			}
			if (flag == true && num % 2 == 0) {
				sumeven = sumeven + num;
			}
			
		}
		System.out.println("Difference of "+ sumodd +" & "+ sumeven+ " is "+ (sumodd-sumeven));
		
	}
		

	
 	public static void main(String args[]) {
		SumOfOddEvenDigitsInString sumOfOddEvenDigitsInString = new SumOfOddEvenDigitsInString();
		sumOfOddEvenDigitsInString.calculateSumOfOdd("te3ch4noc7re9d8its");
	}

}
