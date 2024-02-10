/*Assignment - 52 : 10th Feb'2024

String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}*/

package madhura_kulkarni;

public class Assignment52 {

	int extraxtDigitsInString(String input) {
		String temp = "0";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				temp = temp + input.charAt(index);
		}
		return Integer.parseInt(temp);
	}

	int[] getOutputString(String[] str) {
		int[] numArray = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			numArray[i] = extraxtDigitsInString(str[i]);
		}
		return numArray;
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int str1[] = new Assignment52().getOutputString(arr);
		System.out.println("Output String after extracting digits from it: ");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] +" ");
		}
	}

}
