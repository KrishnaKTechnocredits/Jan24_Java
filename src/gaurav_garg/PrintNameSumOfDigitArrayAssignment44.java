package gaurav_garg;

public class PrintNameSumOfDigitArrayAssignment44 {
    
	int sumOfDigit(String str)
	{ 
		int sum=0;
		for(int index=0;index<str.length();index++)
		{
		 char char1=str.charAt(index);
		 boolean answer=Character.isDigit(char1);
		 if(answer== true)
		 {
			 int numericvalue= Character.getNumericValue(char1);
			 sum=sum+numericvalue;
		 }
		}
		return sum;
	}
	
	void sumOfDigitInArray(String str[])
	{
		for(int index=0;index<str.length;index++)
		{
			int count= sumOfDigit(str[index]);
			System.out.println(str[index]+" -> "+count);
		}
	}
	public static void main(String[] args) {
		String str[]= { "Aakansha","Aas3hvi","Isha","I2sh4a4n"};
		new PrintNameSumOfDigitArrayAssignment44().sumOfDigitInArray(str);
	}
	
}
