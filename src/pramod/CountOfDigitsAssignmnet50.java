package pramod;

//WAP to find count of digits in a given String.
//String str = "H2i H3el4lo P4un2e5";
//output : 6

public class CountOfDigitsAssignmnet50 {
	void getLastChar(String arr1)
	{
		int count=0;
		for(int i=0;i<arr1.length();i++) 
		{
			if(Character.isDigit(arr1.charAt(i)))
				count++;
		}
		System.out.println("count of digits in a given String="+count);
	}
	
	public static void main(String args[])
	{
		CountOfDigitsAssignmnet50 assign50 =new CountOfDigitsAssignmnet50();
		String str= "H2i H3el4lo P4un2e5";
		assign50.getLastChar(str);
	}
}
