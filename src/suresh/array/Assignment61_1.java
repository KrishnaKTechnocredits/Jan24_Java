package suresh.array;

public class Assignment61_1 {

	void getSumOfNegativeNumbsers(String input)
	{int sum=0;
		for(int i=0;i<input.length();i++)
		{
			//char ch=input.charAt(i);
			if(input.charAt(i)=='-')
				{
					sum=sum+(Character.getNumericValue(input.charAt(i+1))*-1);
				}
		
	}System.out.println(sum);
	}
		public static void main(String[] args)
		{
			new Assignment61_1().getSumOfNegativeNumbsers("te-3ch4noc7red-8its");
		}
}
