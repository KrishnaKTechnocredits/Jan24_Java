package gaurav_garg;

public class PrintnameIfUpperCharMoreLowerCharAssignment45 {

	int printString(String str2)
	{
		int sumuppercase=0;
		int sumlowercase=0;
		for(int stringindex =0;stringindex<str2.length();stringindex++)
		{
			
			char c=str2.charAt(stringindex);
			if(Character.isUpperCase(c)==true)
			{
				sumuppercase =sumuppercase+1;
			}else if(Character.isLowerCase(c)==true)
			{
				sumlowercase=sumlowercase+1;	
			}
		}
		
		return (sumuppercase-sumlowercase);
	}
	
	void printStringIfUpperCaseMoreLowerCase(String str[])
	{
		for(int index=0;index<str.length;index++)
		{
		  int difference =printString(str[index]);
		  if(difference>0)
		  {
			  System.out.println(str[index]);
		  }
		}
	}
	public static void main(String[] args) {
		String str[]= {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}; 
		new PrintnameIfUpperCharMoreLowerCharAssignment45().printStringIfUpperCaseMoreLowerCase(str);
	}
}
