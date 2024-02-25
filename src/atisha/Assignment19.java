package atisha;

//print the frequency of the given character from the given string without case sensitivity (count lower +uppper case), please consider given character will be passed as lowercase.

class Assignment19 
{
   void countOfChar(String str, char ch){
	   int count = 0;
	for (int i=0 ;i<str.length() ;i++ )
	{
		str = str.toLowerCase();
		char ch1 = str.charAt(i);
		if (ch1 == ch )
		{
			count++;
		}
         
	}
	System.out.println("frequency of given character : "+count);
   }
	public static void main(String[] args) 
	{
		new Assignment19().countOfChar("technocRediTs Teaches technology" , 't');
	}
}
