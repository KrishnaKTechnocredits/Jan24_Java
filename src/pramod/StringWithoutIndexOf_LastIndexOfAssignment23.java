package pramod;

public class StringWithoutIndexOf_LastIndexOfAssignment23 {
	
	public static void main(String args[])
	{
		StringWithoutIndexOf_LastIndexOfAssignment23 string1 = new StringWithoutIndexOf_LastIndexOfAssignment23();
		string1.stringFunctionAssignment("technocredits");		
	}

	void stringFunctionAssignment(String str) {	
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			int freq = getfreq(str,ch);
			if(freq==1)
				System.out.print(ch);
		}		
	}

	int getfreq(String str, char ch) {
		int count=0;
		for(int index=0;index<str.length();index++)
		{
			if(ch==str.charAt(index))
				count++;
		}
		return count;
	}
}