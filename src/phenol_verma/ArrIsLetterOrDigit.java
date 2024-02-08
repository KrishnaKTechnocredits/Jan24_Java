/*
Assignment - 42 : 4th Feb'2024
PhenolV_Assignment_48
Print all the names from given array having atleast one special character.
input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha*/

package phenol_verma;

public class ArrIsLetterOrDigit {
	void findSpecialChar(String arr[]) {
		int countSplChar = 0;
		for (int index = 0; index < arr.length; index++) {
			String testStr = arr[index];
			for (int chIndex = 0; chIndex < testStr.length(); chIndex++) {
				char ch = testStr.charAt(chIndex);
				if (!Character.isLetterOrDigit(ch)) {
					System.out.println(testStr);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrIsLetterOrDigit arrIsLetterOrDigit = new ArrIsLetterOrDigit();
		String arr[] = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		arrIsLetterOrDigit.findSpecialChar(arr);

	}
}
