package lovekesh_mishra;

class LengthOfArrayAssignment39 {

	String printNames(String[] input) {
		String names = " ";
		System.out.println("output is---> ");
		for (int i = 0; i < input.length; i++) {
			names = input[i];
			char ch = names.charAt(0);
			if (input[i].length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(names);
			}

		}
		return names;
	}

	public static void main(String[] args) {
		LengthOfArrayAssignment39 ans = new LengthOfArrayAssignment39();
		String[] n = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		ans.printNames(n);
	}

}
