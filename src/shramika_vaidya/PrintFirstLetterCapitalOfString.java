package shramika_vaidya;

//Assignment67- part2
public class PrintFirstLetterCapitalOfString {

	String[] setFirstLetterCapital(String[] str) {
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			char ch = str[i].charAt(0);
			String str1 = String.valueOf(ch);
			output[i] = str[i].replaceFirst(str1, str1.toUpperCase());
			System.out.print(output[i] + " ");
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "hi hEllo how are you";
		String[] arr = str.split(" ");
		new PrintFirstLetterCapitalOfString().setFirstLetterCapital(arr);
	}
}
