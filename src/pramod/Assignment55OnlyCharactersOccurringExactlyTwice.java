package pramod;

//"Print only characters occurring exactly twice:
//input: teecccchhhnno;
//output: en"

public class Assignment55OnlyCharactersOccurringExactlyTwice {
	
	
	int charfre(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
				count++;
		}
		return count;
	}
	
	void getChar(String str)
	{
		for(int i=0;i<str.length();i++)
		{ 
			int freq=charfre(str,str.charAt(i));
			char ch=str.charAt(i);
			if(freq==2)
			{
				if (str.indexOf(ch) == i) {
					System.out.println("only characters occurring exactly twice="+ch);
				}
		}
		}
	}
	
	public static void main(String args[])
	{
		Assignment55OnlyCharactersOccurringExactlyTwice assign55 =new Assignment55OnlyCharactersOccurringExactlyTwice();
		String str= "teecccchhhnno";
		assign55.getChar(str);
	}
}
