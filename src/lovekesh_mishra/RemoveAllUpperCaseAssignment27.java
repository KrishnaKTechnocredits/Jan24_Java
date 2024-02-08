package lovekesh_mishra;

class RemoveAllUpperCaseAssignment27 {

	void removeUpperCase(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				String temp = String.valueOf(ch);
				input = input.replace(temp, "*");

			}

		}
		input = input.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		RemoveAllUpperCaseAssignment27 removeAllUpperCaseAssignment27 = new RemoveAllUpperCaseAssignment27();
		removeAllUpperCaseAssignment27.removeUpperCase("TechNoCREdits");
	}

}
