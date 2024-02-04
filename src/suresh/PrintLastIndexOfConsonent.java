package suresh;

public class PrintLastIndexOfConsonent {

	
	void printLastIndexConsonent(String input )
	{int count=0;
		for (int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch!='a')
			{
				if( input.indexOf(ch)==input.lastIndexOf(ch))
				{
					//System.out.println(ch);
					count++;
					//System.out.println(count);
				}if(count==4)
				{
					System.out.println(ch);
				}
			}
		}
	}
	public static void main(String[]args)
	{
		new PrintLastIndexOfConsonent(). printLastIndexConsonent("aakansha");
	}
}
