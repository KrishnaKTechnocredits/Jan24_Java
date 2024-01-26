package pramod;

public class StringLowerCaseAssignment19 {
	
	int stringLowerCaseNumber(String str)
	{  
		int count=0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		StringLowerCaseAssignment19 stringLowerCase = new StringLowerCaseAssignment19();
		int number = stringLowerCase.stringLowerCaseNumber("technocrediTs teaches Technology");
		System.out.println("frequency of t in technocredits is "+number);
	}

}
