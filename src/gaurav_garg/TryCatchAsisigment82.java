package gaurav_garg;

public class TryCatchAsisigment82 {

	void printCountDigit(String str)
	{
		int sum=0;
		String new1[]=str.split(" ");
		for(String abc:new1)
		{
			try
			{
				int num=Integer.parseInt(abc);
				sum =sum+num;
			}
			catch(Exception e)
			{
			    e.getMessage();
			}
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		new TryCatchAsisigment82().printCountDigit(str);
	}
}
