package rohini_deshmane.array_programs;

public class ExtractDigitsFromStringArray {

	int getDigit(String str) {
		int digit=0;
		char ch; 
		String digitStr ="0";
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digitStr = digitStr +ch;
			}
		}
		digit = Integer.parseInt(digitStr);
		return digit;
	}
	
	int[] getDigitArray(String[] arr) {
		int[] digitArr = new int[arr.length];
		for(int index=0; index<digitArr.length; index++) {
			digitArr[index] = getDigit(arr[index]);
		}
		return digitArr;
	}
	
	public static void main(String[] args) {
		ExtractDigitsFromStringArray extractDigit = new ExtractDigitsFromStringArray();
		String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
		int[] digitArr = extractDigit.getDigitArray(arr);
		System.out.println("Digits from Array = ");
		for(int index =0; index< digitArr.length; index++) {
			System.out.println(digitArr[index]);
		}
	}
}
