package pramod;

//Assignment - 67 : 17th Feb'2024
//Create required methods to complete below 3 programs.
//Its on you how many java classes you want to write, all methods in same class is also ok.
//
//Program 1: 
//input : Hi Hello Maulik
//output : iH olleH kiluaM
//
//PRogram 2: 
//String str = "hi hEllO how are you";
//output : Hi Hello How Are You
//
//Program 3: 
//input : Hi Hello Maulik
//output : Ih Olleh Kiluam

public class Assignment67StringEachWordReverse {
	
	void stringReverse1(String str1)
	{
		String rev1 = "";
		String[] arr1=str1.split(" ");
		for(int i=0;i<arr1.length;i++)
		{ 
			rev1=rev1+getReverse1(arr1[i])+" ";
		}
		rev1.trim();

		System.out.println("final1="+rev1);
	}
	
	void stringReverse2(String str1)
	{
		String rev1 = "";
		String[] arr1=str1.split(" ");
		for(int i=0;i<arr1.length;i++)
		{ 
			rev1=rev1+getReverse2(arr1[i])+" ";
		}
		rev1.trim();

		System.out.println("final1="+rev1);
	}
	
	void stringReverse3(String str1)
	{
		String rev1 = "";
		String[] arr1=str1.split(" ");
		for(int i=0;i<arr1.length;i++)
		{ 
			rev1=rev1+getReverse3(arr1[i])+" ";
		}
		rev1.trim();

		System.out.println("final1="+rev1);
	}
	
	String getReverse1(String str11)
	{
		String str12 = "";
		for(int i=str11.length()-1;i>=0;i--)
		{
			str12=str12+str11.charAt(i);
		}
		return str12;
	}
	
	String getReverse2(String str11)
	{
		String str12 = ""+Character.toUpperCase(str11.charAt(0));
		for(int i=1;i<str11.length();i++)
		{
			str12=str12+Character.toLowerCase(str11.charAt(i));
		}
		return str12;
	}

	String getReverse3(String str11)
	{
		String str12 = ""+Character.toUpperCase(str11.charAt(str11.length()-1));
		for(int i=str11.length()-2;i>=0;i--)
		{	
			str12=str12+Character.toLowerCase(str11.charAt(i));
		}
		return str12;
	}

	public static void main(String args[])
	{
		Assignment67StringEachWordReverse assign67 =new Assignment67StringEachWordReverse();
		String str1= "Hi Hello Maulik";
		String str2= "hi hEllO how are you";
		String str3= "Hi Hello Maulik";
		assign67.stringReverse1(str1);
		assign67.stringReverse2(str2);
		assign67.stringReverse3(str3);
	}
}
