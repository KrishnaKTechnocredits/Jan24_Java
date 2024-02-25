/*
 "Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
 */
package gaurav_garg;

public class PrintStringRemoveWhiteSpaceAndDigitAssignment65 {

	void printRearrangeTheString(String str)
	{
		String stringnormal="";
		for(int index=0;index<str.length();index++)
		{
			char char1=str.charAt(index);
			if(!Character.isDigit(char1) && char1!=' ')
			{
				stringnormal =stringnormal+char1;
			}
		}
		System.out.print(stringnormal);
	}
	public static void main(String[] args) {
		new PrintStringRemoveWhiteSpaceAndDigitAssignment65().printRearrangeTheString("H2i H3el4lo P4un2e5");
	}
}
