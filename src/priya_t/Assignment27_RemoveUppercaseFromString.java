package priya_t;

public class Assignment27_RemoveUppercaseFromString {

	String str = "TechNoCREdits";

	void removeuppercase() {

		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
			}
		}
		String finalStr = str.replaceAll("[TNCRE]", "");
		System.out.println("String after removing uppercase : " + finalStr);
    }

	public static void main(String[] args) {
		Assignment27_RemoveUppercaseFromString replace = new Assignment27_RemoveUppercaseFromString();
		replace.removeuppercase();
    }
}
