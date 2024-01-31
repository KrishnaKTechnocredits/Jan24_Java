package pramod;

public class DuplicateCharactersGivenStringAssignment25 {

	
	public static void main(String args[])
	{
		DuplicateCharactersGivenStringAssignment25 string1 = new DuplicateCharactersGivenStringAssignment25();
		string1.stringFunctionAssignment("aakanksha");		
	}
	
	
	void stringFunctionAssignment(String str)
	{
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			if (index == str.indexOf(ch)) 
			{
				if(str.indexOf(ch)!=str.lastIndexOf(ch))
				{
				System.out.println(ch);
				}
			}
		}
	}
}
