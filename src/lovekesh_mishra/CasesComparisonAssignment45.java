package lovekesh_mishra;

class CasesComparisonAssignment45 {

	int getUpper(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch) == true) {
				count++;
			}

		}
		return count;

	}

	int getLower(String input) {
		int count1 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLowerCase(ch) == true) {
				count1++;
			}
		}
		return count1;
	}

	void printAllNames(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (getUpper(str[i]) > getLower(str[i])) {
				System.out.println(str[i]);
			}

		}
	}

	public static void main(String[] args) {
		CasesComparisonAssignment45 ans = new CasesComparisonAssignment45();
		String[] str = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		ans.printAllNames(str);
	}
}
