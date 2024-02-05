package gaurav_garg;

public class PrintNamehavingtwoOrMoreDigitAssignment42 {

	int getDigitInString(String str)
	{
		int digit =0;
	    for(int index=0;index<str.length();index++)
	    {
	    	char c=str.charAt(index);
	    	if(Character.isDigit(c)== true)
	    	{
	    		digit++;
	    	}
	    }
		return digit;
	}
	void printStringHaveMinTwoDigit(String str[])
	{
		for(int index=0;index<str.length;index++)
		{
			int digit =getDigitInString(str[index]);
			if(digit>=2)
			System.out.println(str[index]);
		}
	}
	public static void main(String[] args) {
		String str[]= {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		new PrintNamehavingtwoOrMoreDigitAssignment42().printStringHaveMinTwoDigit(str);
	}
}
