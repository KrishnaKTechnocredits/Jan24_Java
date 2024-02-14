package atisha;

//print the frequency of the given character from the given string..

class Assignment17 
{
	void frequency(String str , char ch){
		int count = 0;
		for (int i = 0; i<str.length() ;i++ )
		{
			
			char ch1 = str.charAt(i);
			if (ch1 == ch)
			{
				count++;
			}
		}
           System.out.println("frequency of 't' is -> " + count);
	}
	public static void main(String[] args) 
	{
		Assignment17 as = new Assignment17();
		as.frequency("technocredits" , 't');
		
	}
}
