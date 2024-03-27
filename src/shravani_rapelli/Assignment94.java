package shravani_rapelli;

public class Assignment94 {

	void reverseString(String str) {
		String newWord = "";
		String str1[] = str.split(" ");
		for(int i=str1.length-1; i>=0; i--) {
			newWord += str1[i]+ " ";
		}
		System.out.println(newWord.trim());
	}
	public static void main(String[] args) {
		Assignment94 assgn94 = new Assignment94();
		String str = "Kajol is Working in Roche";
		assgn94.reverseString(str);
	}
}
