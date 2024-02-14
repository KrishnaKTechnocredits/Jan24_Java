package atisha;

//print the difference btwn all odd & even digit in the given string

class Assignment29 
{
	void difference(String str){
		int sum1=0;
		int sum2=0;
		for ( int i=0; i<str.length() ;i++ )
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
			{
				int num = Character.getNumericValue(ch);
				if (num % 2!=0)
				{
					sum1= sum1+num;
				}
				if (num % 2==0)
				{
					sum2= sum2+num;
				}
			}
		}
		System.out.println("difference btwn all the odd &even digits is  " +(sum2 - sum1));
	}
	
	public static void main(String[] args) 
	{
              new  Assignment29().difference("te3c4hno7regd8its");	
					   
	}
}
