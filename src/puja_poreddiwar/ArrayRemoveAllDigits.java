/*Assignment - 51 : 9th Feb'2024
	WAP to remove all digits from given String.
	String str = "H2i H3el4lo P4un2e5";
	output : Hi Hello Pune 
*/


package puja_poreddiwar;

public class ArrayRemoveAllDigits {

	String str = "";
	
	void removeDigitsFromString(String arr) {
		for(int index=0;index<arr.length();index++) {
			char ch = arr.charAt(index);
			boolean flag = Character.isDigit(ch);
			if(flag != true) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		String arr = "H2i H3el4lo P4un2e5";
		ArrayRemoveAllDigits AR1 = new ArrayRemoveAllDigits();
		AR1.removeDigitsFromString(arr);
	}
}
