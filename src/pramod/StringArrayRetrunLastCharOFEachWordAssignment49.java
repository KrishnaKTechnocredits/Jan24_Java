package pramod;


//Write a method which accept String Array and return char Array. 
//return last character of each word, if last character is digit, then consider second last character.
//
//input : techno credits32 pune4 indi5a
//output : o3ea

public class StringArrayRetrunLastCharOFEachWordAssignment49 {

	
	char[] getLastChar(String[] arr)
	{
		char[] chr1 = new char[arr.length];
		for(int i=0;i<chr1.length;i++)
		{
			int len =arr[i].length();
			if(!Character.isDigit(arr[i].charAt(len-1)))		
				chr1[i]=arr[i].toUpperCase().charAt(len-1);
			else
				chr1[i]=arr[i].toUpperCase().charAt(len-2);
		}	
		return chr1;
	}
	
	void display(char[] chr2)
	{
		for(int d=0;d<chr2.length;d++)
			System.out.println("last char of each string = "+chr2[d]);
	}
		
	public static void main(String args[])
	{
		StringArrayRetrunLastCharOFEachWordAssignment49 assign49 =new StringArrayRetrunLastCharOFEachWordAssignment49();
		String str= "techno credits32 pune4 indi5a";
		String[] arr1=str.split(" ");
		char[] charArr21 = assign49.getLastChar(arr1);
		assign49.display(charArr21);
	}
}
