package aanand;
/*Remove all Uppercase character from given String. 
input = "TechNoCREdits"
output : echodits*/

public class Assignment27 {

	String removeUpperCharFromString(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				str.replace(String.valueOf(ch), "");
			else
				output = output + ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String output = assignment27.removeUpperCharFromString("TechNoCREdits");
		System.out.println(output);
	}
}