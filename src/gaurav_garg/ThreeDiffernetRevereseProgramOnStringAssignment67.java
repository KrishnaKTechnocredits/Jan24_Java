package gaurav_garg;

public class ThreeDiffernetRevereseProgramOnStringAssignment67 {

	String reverseString(String s)
	{
		String str ="";
		for(int index=s.length()-1;index>=0;index--)
		{
			str=str + s.charAt(index);
		}
		return str;
	}
	
	void reversStringInWord(String str)
	{
		String str1[]=str.split(" ");
		String newstring ="";
		for(int index=0;index<str1.length;index++)
		{
          String reverse= reverseString(str1[index]);
          newstring =newstring +reverse+" ";
		}
		 System.out.println(newstring.trim());
	}
	
	String toUpperCaseFirstCharacter(String str)
	{
		String lowerstring ="";
		String newstring="";
		for(int index=0;index<str.length();index++)
		{
			char c =str.charAt(index);
			if(index==0)
			{
				lowerstring= lowerstring +Character.toUpperCase(c); 
			}else {
				newstring= newstring +Character.toLowerCase(c); 
			}
		}
		return  lowerstring + newstring;
	}
	
	void uppercaseFirstCharacterLowerCaseRest(String str)
	{
		String outputstring="";
		String str1[]=str.split(" ");
		for(int index =0;index<str1.length;index++)
		{
			String str3 =toUpperCaseFirstCharacter(str1[index]);
			outputstring=outputstring+ str3+" ";
			
		}
		System.out.println(outputstring.trim());
	}
	
	void revereStringWIthFirstCharacterUpperCaseRestLower(String str)
	{
		String str1[]=str.split(" ");
		String outputstring="";
		for(int index =0;index<str1.length;index++)
		{
		   String str3 =reverseString(str1[index]);
		   str3=toUpperCaseFirstCharacter(str3);
		   outputstring=outputstring+ str3+" ";
		}
		System.out.println(outputstring.trim());
	}
	
	public static void main(String[] args) {
		ThreeDiffernetRevereseProgramOnStringAssignment67 threeDiffernetRevereseProgramOnStringAssignment67= new ThreeDiffernetRevereseProgramOnStringAssignment67();
		System.out.println("###Program 1###");
		String str="Hi Hello Maulik";
		System.out.println(str);
		threeDiffernetRevereseProgramOnStringAssignment67.reversStringInWord(str);	
		System.out.println("\n###Program 2###");
		String str1 ="hi hEllO how are you";
		System.out.println(str1);
		threeDiffernetRevereseProgramOnStringAssignment67.uppercaseFirstCharacterLowerCaseRest(str1);	
		String str2 ="Hi Hello Maulik";
		System.out.println("\n###Program 3###");
		System.out.println(str2);
		threeDiffernetRevereseProgramOnStringAssignment67.revereStringWIthFirstCharacterUpperCaseRestLower(str2);
	}
}
