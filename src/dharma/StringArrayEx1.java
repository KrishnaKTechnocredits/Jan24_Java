package dharma;

public class StringArrayEx1 {

	int toGetAllDigit(String str) {
		String str1 = "0";
		for(int i = 0;i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				str1 = str1 + ch;
			}
		}
		return Integer.parseInt(str1);
	}
	
	int[] printAllDigit(String[] input) {
	    int[] arr1 = new int[input.length];
		for(int i = 0; i < input.length; i++) {
			arr1[i] = toGetAllDigit(input[i]);
		}
		return arr1;
	}
	public static void main(String[] args) {
		String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
	    int[] output =new StringArrayEx1().printAllDigit(arr);
	    for(int i = 0; i < output.length;i++)
	    System.out.println(output[i]);

	}

}
