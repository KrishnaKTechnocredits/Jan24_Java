package pramod;

public class Assignment59CharacterWithMaximumFrequency {

//	Assignment - 59 : 14th Feb'2024
//	"Print the character with maximum frequency:
//	input: TeeCccChH
//	output: c->4"
	
	
	int charFreq(String str, char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{			
			char ch1=str.charAt(i);
			if(ch==ch1)
				count++;
		}
		return count;
	}
	void MaximumFrequency(String str)
	{
		int maxcount=0, count=0,position=0;
		String str1=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			count=charFreq(str1,str1.charAt(i));
			if(count>maxcount)
			{
				maxcount=count;
				position=i;
			}	
		}
		System.out.println(str.charAt(position)+"->"+maxcount);
	}
	
	
	
	public static void main(String args[])
	{
		Assignment59CharacterWithMaximumFrequency assign59 = new Assignment59CharacterWithMaximumFrequency();
		String str="TeeCccChH";
		assign59.MaximumFrequency(str);
	}
}
