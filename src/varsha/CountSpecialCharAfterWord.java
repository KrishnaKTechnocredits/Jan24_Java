package varsha;

//I__am___in_pune____
//
//output : I -> 2
//         am -> 3
//		 in -> 1
//         pune -> 4	

public class CountSpecialCharAfterWord {

	void printWordandSpecialCharFromGivenString(String str) {
		String word = "";
		String specialCh = "";
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == '_') {
				specialCh = specialCh + chArr[i];
			} else {
				if (specialCh.length() > 0) {
					System.out.println(word + "->" + specialCh.length());
					word = "";
					specialCh = "";
				}
				word = word + chArr[i];
			}
		}
		if (word.length() > 0)
			System.out.println(word + "->" + specialCh.length());
	}

	public static void main(String[] args) {
		new CountSpecialCharAfterWord().printWordandSpecialCharFromGivenString("I__am___in_pune____");
	}
}
