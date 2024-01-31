//Remove all Uppercase character from given String. 

package shridhar_k;

public class Assignment27 {
	void printWithoutUpperCase(String inputString) {
		for(int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if (flag)
				inputString = inputString.replace(String.valueOf(ch), "");
		}
		System.out.println("output: " + inputString);
	}

	public static void main(String[] args) {
		new Assignment27().printWithoutUpperCase("TechNoCREdits");
	}
}
