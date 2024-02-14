package atisha;

//how many digits are there in the given string
class Assignment22 
{
	
	int printDigits(String str){
		int count = 0;
	for (int i = 0; i<str.length() ; i++ )
	{
		char ch = str.charAt(i);
		if (Character.isDigit(ch))
		{
			count++;
		}
		
	}
	 
	System.out.println("there are " + count + " digits");
	
     return count ;
	}

	public static void main(String[] args) 
	{
		new Assignment22().printDigits("te3ch3n5o2credits");

	}
}
