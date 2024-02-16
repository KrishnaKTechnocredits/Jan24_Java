/*Assignment - 62 : 16th Feb'2024
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"*/
package madhura_kulkarni;

public class Assignment62 {

	void getSumOfAllNumInString(String str) {

		double sum = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (str.charAt(i + 1) == '.') {
					temp = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1))
							+ Character.toString(str.charAt(i + 2));
					sum = sum + Double.parseDouble(temp);
				} else {
					sum = sum + Character.getNumericValue(str.charAt(i));
				}

			}
		}
		System.out.println("Sum of all the numbers in string : " +sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4.5noc7red8.1its";
		new Assignment62().getSumOfAllNumInString(input);
	}

}
