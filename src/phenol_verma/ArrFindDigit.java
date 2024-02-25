/*
 Assignment - 52 : 10th Feb'2024
 PhenolV_Assignment_58

String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}
*/
package phenol_verma;

public class ArrFindDigit {

	int[] findDigitFromArray(String arr[]) {
		String finalStr = "";
		int finalStrArr[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int indexStr = 0; indexStr < str.length(); indexStr++) {
				char ch = str.charAt(indexStr);
				if (Character.isDigit(ch)) {
					finalStr = finalStr + ch;
				}
			}
			if (finalStr.length() > 0) {
				finalStrArr[index] = Integer.parseInt(finalStr);
			} else {
				finalStrArr[index] = 0;
			}
			finalStr = "";
		}
		return finalStrArr;
	}

	void addToArray(int finalStrArr[]) {
		System.out.print("{");
		for (int i = 0; i < finalStrArr.length; i++) {
			System.out.print(finalStrArr[i]);
			if (i < finalStrArr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		ArrFindDigit arrFindDigit = new ArrFindDigit();
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja"};
		System.out.println("Original Array =  { \"tech1no3cr4edits\", \"prathm5es6h\", \"a4ksha7y\", \"Padmaja\"}");
		int finalDigArr[] = arrFindDigit.findDigitFromArray(arr);
		System.out.print("Final array with digits only = ");
		arrFindDigit.addToArray(finalDigArr);
	}

}
