/*
 Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH3v7i-?!"
 */
package gaurav_garg;

public class printStringSpeacialCharacterAtEndAssignment64 {

	void printRearrangeTheString(String str)
	{
		String stringnormal="";
		String speacial="";
		for(int index=0;index<str.length();index++)
		{
			char char1=str.charAt(index);
			if(Character.isLetter(char1) || Character.isDigit(char1))
			{
				stringnormal =stringnormal+char1;
			}else
			{
				speacial =speacial +char1;
			}
		}
		System.out.print(stringnormal+speacial);
	}
	public static void main(String[] args) {
		new printStringSpeacialCharacterAtEndAssignment64().printRearrangeTheString("-AasH?3v7i!");
	}
}
