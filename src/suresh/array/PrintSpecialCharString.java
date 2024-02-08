package suresh.array;

public class PrintSpecialCharString {

	
	int printSpecialCharString(String input)
	{int count=0;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			boolean flag1= Character.isDigit(ch);
			boolean flag2=Character.isUpperCase(ch);
			boolean flag3=Character.isLowerCase(ch);
			
			if(flag1==false && flag2==false&& flag3==false)
			{
			
				count=count+1;
				//System.out.println(count);
			}
			
			
		}return count;
	}
	void getString(String[]index)
	{
		for(int i=0;i<index.length;i++)
		{
			String str=index[i];
			int count=printSpecialCharString(str);
			if(count>=1)
			{
				System.out.println(str);
			}
			
		}
	}
	public static void main(String[]args)
	{
		String[] arry= {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new PrintSpecialCharString().getString(arry);
	}
	
}
