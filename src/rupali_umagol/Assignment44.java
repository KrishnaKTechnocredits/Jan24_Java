package rupali_umagol;

public class Assignment44 {
	void getSumDigit(String names) {
		int sum=0;
		for(int i=0;i<names.length();i++) {
			char ch=names.charAt(i);
			boolean b=Character.isDigit(ch);
			if(b==true) {
				int digit=Integer.parseInt(String.valueOf(ch));
				sum=sum+digit;
			}
		}
		System.out.println(names +"->" + sum);
	}
	
	void sumArray(String[] input) {
		for(int i=0;i<input.length;i++) {
			getSumDigit(input[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment44 assignment44=new Assignment44();
		String[] arr= {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n"};
		assignment44.sumArray(arr);
	}
}