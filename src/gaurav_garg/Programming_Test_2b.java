package gaurav_garg;

public class Programming_Test_2b {

	void printLastConstantValue(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			if(c !='a' && c!='e' && c!='i'&& c!='o'&& c!='u' )
			{
				System.out.print(c);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Programming_Test_2b().printLastConstantValue("aakansha");
	}
}
