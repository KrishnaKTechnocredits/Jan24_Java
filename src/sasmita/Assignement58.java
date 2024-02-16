package sasmita;

public class Assignement58 {
	void FindminimumFrequency(String str) {
		int count = 0;
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				count++;
				System.out.println(ch + " Last character with minimum frequency :" + count);
				break;
			}

		}
	}

	public static void main(String[] args) {
		Assignement58 assignment58 = new Assignement58();
		assignment58.FindminimumFrequency("aakanksha");

	}

}


