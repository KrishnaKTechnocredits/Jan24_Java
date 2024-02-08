package dharma;

public class LastCharAndsecondLastCharEx1 {

	char[] getDigitOfArray(String[] arr) {
		char[] ch = new char[arr.length];
		for(int i = 0; i < arr.length; i++) {
			char ch1 = arr[i].charAt(arr[i].length()-1);
			int len =arr[i].length();
			if(Character.isDigit(ch1)) {
				ch[i] = arr[i].charAt(len-2);
			}else {
				ch[i] = arr[i].charAt(len-1);
			}
		}
		return ch;
	}
	
	void displayCharArray(char[] ch) {
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
	
	public static void main(String[] args) {
		LastCharAndsecondLastCharEx1 lastcharandsecondlastcharex1 = new LastCharAndsecondLastCharEx1();
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		char[] output = lastcharandsecondlastcharex1.getDigitOfArray(arr);
		lastcharandsecondlastcharex1.displayCharArray(output); 
	}
}
