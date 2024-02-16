package pramod;

//Assignment - 57 : 14th Feb'2024
//"Print sum of squares of odd digits:
//input: te3ch4noc7red8its
//output: 58 
//Hint: 3^2 + 7^2 = 9 + 49 = 58"

public class Assignment57SumOfSquaresOfOddDigits {
	
	void SquareOfOddDigits(String str)
	{
		int sum=0;
		int sqaure=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)) && Character.getNumericValue(str.charAt(i))%2!=0)
			{
				int num = Character.getNumericValue(str.charAt(i));
				sqaure = num * num;
				sum=sum+sqaure;
			}
		}
		System.out.print("Output = "+sum);	
	}
	
	public static void main(String args[])
	{
		Assignment57SumOfSquaresOfOddDigits assign57 = new Assignment57SumOfSquaresOfOddDigits();
		String str="te3ch4noc7red8its";
		assign57.SquareOfOddDigits(str);
	}
}
