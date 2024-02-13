package shravani_rapelli;

public class Assignment52 {
	
	int getDigitFromString(String str) {
		String ans = "0";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				ans = ans + ch;
			}
		}
		return Integer.parseInt(ans);
	}

	void getNumFromArray(String[] arr) {
		int[] num = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			num[index] = getDigitFromString(arr[index]);
			System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		Assignment52 assignment52 = new Assignment52();
		assignment52.getNumFromArray(input);
	}

}
