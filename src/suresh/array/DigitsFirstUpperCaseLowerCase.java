package suresh.array;

public class DigitsFirstUpperCaseLowerCase {

	
	void printFirstdigitUpperLowercase(String input)
	{
		String digitstr ="";
		String lowercase=" ";
		String uppercase=" ";
		String ans=" ";
		for (int i=0;i<input.length();i++)
			{
			char ch= input.charAt(i);
			if(Character.isDigit(ch))
			
				digitstr=digitstr+ch;
			
			else if(Character.isUpperCase(ch))
			
				uppercase=uppercase+ch;
			
			else if (Character.isLowerCase(ch))
				
				lowercase=lowercase+ch;
				;
	ans=(digitstr+uppercase+lowercase);
	
			}System.out.print(ans);
}
	public static void main(String[]args)
	{
		DigitsFirstUpperCaseLowerCase digitsFirstUpperCaseLowerCase =new DigitsFirstUpperCaseLowerCase();
		digitsFirstUpperCaseLowerCase.printFirstdigitUpperLowercase("AasH3v7i");
	}
}
	
