package gaurav_garg;

public class PrintSumOfNegativeNumberAssignemnt61 {

	void printSumOfNegativeNumber(String str)
	{
		int sum=0;
		for(int index=0;index<str.length();index++)
		{
			char char1=str.charAt(index);
			 
			if(char1 =='-')
			{
				char char2=str.charAt(index+1);
				sum = sum+ Character.getNumericValue(char2);
			}
		}
		
		System.out.print(-1*sum);
	}
	
	public static void main(String[] args) {
		new PrintSumOfNegativeNumberAssignemnt61().printSumOfNegativeNumber("te-3ch4noc7red-8its");
	}
}
