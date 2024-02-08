package puja_poreddiwar;

public class PrintDifference {
	int sumOfOdd = 0;
	int sumOfEven = 0;
	int temp;
	void printAllOddDigits(String str) 
	{
		System.out.print("sum of all the odd digits in the given String : " );
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) 
			{
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) 
				{
					sumOfOdd = sumOfOdd + num;
				}
			}
		}
		System.out.println(sumOfOdd);
	}
	
	
	void printAllEvenDigits(String str) 
	{
		System.out.print("sum of all the odd digits in the given String : " );
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) 
			{
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) 
				{
					sumOfEven = sumOfEven + num;
				}
			}
		}
		System.out.println(sumOfEven);
	}

	void diffBetweenOddEvenNo() 
	{
		
		temp = sumOfOdd - sumOfEven;
		System.out.println("difference between sum of all the odd digits and even digits in the given String : " + temp);
	}
	public static void main(String[] args){
		PrintDifference PrintDifference = new PrintDifference();
		PrintDifference.printAllOddDigits("te3ch4noc7re9d8its");
		PrintDifference.printAllEvenDigits("te3ch4noc7re9d8its");
		PrintDifference.diffBetweenOddEvenNo();
	}
}
