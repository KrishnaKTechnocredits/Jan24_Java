/*
 * Assignment - 46 : 4th Feb'2024
PhenolV_Assignment_52
Return the string extracting all the digits from it. 
input :-		String arr[] = { "AasH3v7i", "Aaka2ns5ha", "I2sh4a4n", "Aas3hvi" };

output:-AasHvi
Aakansha
Ishan
Aashvi


hint
if(!Character.isDigit(ch))
	str = str + ch;
 */
package phenol_verma;

public class ArrRemoveAllDigit {

	void removeDigit(String arr[]) {
		String finalString = "";
		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				if (!Character.isDigit(testStr.charAt(chIndex))) {
					finalString = finalString + testStr.charAt(chIndex);
				}
			}
			System.out.println(finalString);
			finalString = "";
		}
	}

	public static void main(String[] args) {
		ArrRemoveAllDigit arrRemoveAllDigit = new ArrRemoveAllDigit();
		String arr[] = { "AasH3v7i", "Aaka2ns5ha", "I2sh4a4n", "Aas3hvi" };
		arrRemoveAllDigit.removeDigit(arr);
	}
}
