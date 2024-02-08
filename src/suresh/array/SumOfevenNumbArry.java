package suresh.array;

public class SumOfevenNumbArry {

	
	int getTheDigits(String input)
	{int sum=0;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			boolean flag= Character.isDigit(ch);
			if(flag==true)
			{
				sum=sum+Character.getNumericValue(ch);
				//System.out.println(sum);
			}
			
		}return sum;
	}
	
	
	
	void getTheString(String[]index)
	{int totalSum=0;
	String str1=" ";
		for(int i=0;i<index.length;i++)
		{
			String str=index[i];
			int sum=getTheDigits(str);
			if(sum>=0)
			{
				str1=str;
				totalSum=sum;
				System.out.println(str1 +" ----> "+totalSum);
			}
		}
	}
	public static void main(String[]args)
	{
		String[] arry= {"Aakansha", "Aas3hvi"," Isha", "I2sh4a4n"};
		new SumOfevenNumbArry().getTheString(arry);
	}
}

