package pramod;

//Assignment - 56 : 14th Feb'2024
//"Print only unique vowels:
//input: technocredits
//output: oi""

public class Assignment56OnlyUniqueVowels {
	
	void getUniqueVowels(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);	
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
			if(ch=='a'|| ch=='i'|| ch=='e'||ch=='o'||ch=='u')
					System.out.println("only unique vowels="+ch);			
			}
		}
	}
	
	public static void main(String args[])
	{
		Assignment56OnlyUniqueVowels assign56=new Assignment56OnlyUniqueVowels();	
		String str="technocredits";
		assign56.getUniqueVowels(str);
	}
}
