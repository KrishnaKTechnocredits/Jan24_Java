package shraddha;

/*Print sum of all the odd digits in the given String.*/
class PrintSumOfEventOddDigits{
	void printSum(String str){
		int sum =0;
		int sum1 =0;
		for (int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int temp = Character.getNumericValue(ch);
					if(temp%2!=0)
						sum = sum + temp;
					else
						sum1=sum1+temp;
		}
	}
		System.out.println("Sum of Odd numbers is: "+sum);
		System.out.println("Sum Of Even Numbers is: "+sum1);
		System.out.println("Difference: "+(sum-sum1));
	}
	
	public static void main(String[] args){
		PrintSumOfEventOddDigits printSumOfEvenOddDigits = new PrintSumOfEventOddDigits();
		printSumOfEvenOddDigits.printSum("te3ch4noc7re9d8its");
	}
}