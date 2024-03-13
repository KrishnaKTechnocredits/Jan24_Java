/*
 * "Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
 */
package suresh.array;

public class Assignment65 {

	
	void removeTheNegativeNum(String input)
	{int sum= 0;
	String str=" ";
	String str2=" ";
		for(int i=0;i<input.length();i++)
		{
			char ch =input.charAt(i);
			if(ch!='-'&&!Character.isDigit(ch))
			{
				str=str+ch;
				//System.out.println(str);
			}
				else
				{
					str2=str2+ch;
					System.out.println(str2);
				}
				
				sum+=Integer.parseInt(str2);
				
			
				//if(Character.getNumericValue(ch)<0);
			
				
				//sum=sum+Character.getNumericValue(ch);
			
			}System.out.println(sum);
				
		}
	
	
	public static void main(String[] args)
	{
		Assignment65 assignment65 = new Assignment65();
		assignment65.removeTheNegativeNum("te-3ch4noc7red-8its");
	}
}
