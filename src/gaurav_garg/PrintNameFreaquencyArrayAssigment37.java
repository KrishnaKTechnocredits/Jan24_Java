package gaurav_garg;

public class PrintNameFreaquencyArrayAssigment37 {

	
	int getfrequencyString(String str[], String str1)
	{
		int sum=0;
		for(int index=0;index<str.length;index++)
		{
			if(str[index]==str1)
			{
				sum++;
			}
		}
		return sum;
	}
	void printFreaquencyName(String str[])
	{
		int count=0;
		for(int index=0;index<str.length;index++)
		{
			count=getfrequencyString(str,str[index]);
			System.out.println(str[index] +" = "+count);		
		}
		
	}
	public static void main(String[] args) {
		String str[]= {"techno", "credits", "samikash", "varsha", "techno"};
		new PrintNameFreaquencyArrayAssigment37().printFreaquencyName(str);
	}
}
