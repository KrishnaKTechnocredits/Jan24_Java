package atisha;

// remove all the vowels from the given string

class Assignment26 
     
{
	void removeVowels(String str){
		for (int i = 0 ;i<str.length() ;i++ )
		{
			str=str.toLowerCase();
			char ch = str.charAt(i);
			if (ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u')

			{
				String temp = String.valueOf(ch);
			
	            str = str.replace(temp, "");
             }
		}
		
               System.out.println(str);

	}
	public static void main(String[] args) 
	{
		new Assignment26().removeVowels("technocredits");
		
	}
}
