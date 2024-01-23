package suresh;

public class CharStr 
{
	void typAll(String input,char out) 
	{
		
	for(int i=0;i<input.length();i++)
	{
		char chr= input.charAt(i);
		System.out.println(i);

	}
}
			public static void main(String[] args)
			{
			CharStr charStr =new CharStr();
			charStr.typAll("technocredits",'t');
			}
}
