package sasmita;

public class Assignment70 {
	int maxLength = 0;

	int getMaxLength(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLength = arr[index].length();
			}
		}
		return maxLength;
	}

	String getWord(String word, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - word.length();
		for (int index = 0; index < requiredSpace; index++) {
			output = output + " ";

		}
		output = output + word;
		return output;
	}
	String reArrangeDigits(String str) {
		String str1="";
		String str2="";
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch)) {
				str1=str1+Character.getNumericValue(ch);
			}else {
				str2= str2+ch;
			}
		}
		return (str1+str2);
	}

	void processData() {
		String input = "H5el6lo Hi Tech3no2Credits P1une";
		String[] arr = input.split(" ");
		int maxLength = getMaxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			String str= reArrangeDigits(arr[i]);
			String output = getWord(str, maxLength);
			System.out.println(output);

		}

	}

	public static void main(String[] args) {
		Assignment70 assignment70= new Assignment70();
		assignment70.processData();

	}

}
