package sveta;

public class Assignment_44 {

	public int sumOfDigit(String str) {
		int sum =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) 
				sum +=Character.getNumericValue(ch);
		}
		return sum;
	}
	
	public void printString(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			int sum = sumOfDigit(arr[i]);
			System.out.println(arr[i] + " -> " + sum);
		}
	}
	
	public static void main(String[] args) {
		String []arr = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n"};
		new Assignment_44().printString(arr);
	}

}
