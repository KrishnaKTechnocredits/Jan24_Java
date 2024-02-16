/*
Assignment - 61 : 16th Feb'2024
PhenolV_Assignment_65

Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune
 */

package phenol_verma;

public class StrRemovDigitWhiteSpc {
	
	void removDigitWhiteSpace (String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (!Character.isLetter(chr)){
				str = str.replace(Character.toString(chr), "");
				
			}
		}
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		StrRemovDigitWhiteSpc strRemovDigitWhiteSpc = new StrRemovDigitWhiteSpc();
		String str = "H2i H3el4lo P4un2e5";
		System.out.println("Original String - " + str);
		System.out.print("Output String without digit and white spaces - ");
		strRemovDigitWhiteSpc.removDigitWhiteSpace(str);
	}

}
