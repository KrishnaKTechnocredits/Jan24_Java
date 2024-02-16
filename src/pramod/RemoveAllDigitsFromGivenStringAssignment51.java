package pramod;

//WAP to remove all digits from given String.
//String str = "H2i H3el4lo P4un2e5";
//output : Hi Hello Pune

public class RemoveAllDigitsFromGivenStringAssignment51 {

	void removeAll(String arr1)
	{
		int count=0;
		String output="";
		for(int i=0;i<arr1.length();i++) 
		{
			if(!Character.isDigit(arr1.charAt(i)))
			{
				char ch=arr1.charAt(i);
				output=output+ch;
			}
		}
		System.out.println("Remove all digits from given String="+output);
	}
	
	
	public static void main(String args[])
	{
		RemoveAllDigitsFromGivenStringAssignment51 assign51 =new RemoveAllDigitsFromGivenStringAssignment51();
		String str= "H2i H3el4lo P4un2e5";
		assign51.removeAll(str);
	}
}
