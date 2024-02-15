package lovekesh_mishra;

class Assignment57 {

	int getOddDigit(String input) {
		int sum = 0;
		int num = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				if (Character.getNumericValue(ch) % 2 != 0) {
					num = Character.getNumericValue(ch);
					sum = sum + (num * num);
				}
		}
		System.out.println("output is ---> " + sum);
		return sum;
	}

	public static void main(String[] args) {
		Assignment57 ans = new Assignment57();
		ans.getOddDigit("te3ch4noc7red8its");
	}
}