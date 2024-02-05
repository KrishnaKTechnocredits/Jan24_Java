//Print all the names with their frequency from given array.
package priya_t;

public class Assignment37_NameArrayFrequency {
	
	int getfrequency(String str[], String input)
	{
		int sum=0;
		for(int index=0;index<str.length;index++)
		{
			if(str[index]==input)
			{
				sum++;
			}
		}
		return sum;
	}
	void printFrequency(String str[])
	{
		int count=0;
		for(int index=0;index<str.length;index++)
		{
			count=getfrequency(str,str[index]);
			System.out.println(str[index] +" = "+count);		
		}

	}
	public static void main(String[] args) {
		String arr[]= {"techno", "credits", "samikash", "varsha", "techno"};
		Assignment37_NameArrayFrequency frequency= new Assignment37_NameArrayFrequency();
		frequency.printFrequency(arr);
	
	}
}

