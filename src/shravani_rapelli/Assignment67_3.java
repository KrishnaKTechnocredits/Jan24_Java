package shravani_rapelli;

public class Assignment67_3 {
	

	String reverseString(String input) {
		String temp="";
		for(int i=input.length()-1; i>=0; i--) {
			char ch = input.charAt(i);
			temp = temp + ch;
			temp = temp.toLowerCase();
		}
		return temp;
	}
	
	void printActualString(String[] arr) {
		String result="";
		for(int i=0; i<arr.length; i++) {
			String str = reverseString(arr[i]);
			char ch = Character.toUpperCase(str.charAt(0));
			String str1 = str.replace(str.charAt(0), ch);
			result = result + str1+" " ;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Assignment67_3 assg67_3 = new Assignment67_3();
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		assg67_3.printActualString(arr);
	}

}
