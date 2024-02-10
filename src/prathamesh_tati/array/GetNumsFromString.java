//Assignment - 52 : 10th Feb'2024
//
//String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
//output : {134,56,47,0}

package prathamesh_tati.array;

public class GetNumsFromString {

	int getNumsValuesFromString(String str) {
		String temp = "0";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		return Integer.parseInt(temp);
	}

	void getNumsArray(String[] input) {
		int[] output = new int[input.length];
		for (int j = 0; j < input.length; j++) {
			output[j] = getNumsValuesFromString(input[j]);
			System.out.println(output[j]);
		}		
	}
	
	public static void main(String[] args) {
		GetNumsFromString getNumsFromString = new GetNumsFromString();
		String[] input = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		getNumsFromString.getNumsArray(input);
	}
}
