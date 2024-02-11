
/*Assignment - 52 : 10th Feb'2024
 * Remove all digits from string
 * String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
   output : {134,56,47,0}
 */
package sarang_kulkarni;

public class RemoveAlllDigitsFromString {
	
   int getNumberFronString(String input) {
		String temp="0";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp + ch;
			}
		}
		return Integer.parseInt(temp);
	}
	
	void getNumericArr(String[] arr) {
		int cnt=0;
		int[] num1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			num1[i]=getNumberFronString(arr[i]);
			
		}
		System.out.print("{");
		for(int j=0;j<num1.length;j++) {
			cnt++;
			if(cnt==num1.length)
				System.out.print(num1[j]);
			else
			System.out.print(num1[j]+",");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		RemoveAlllDigitsFromString num = new RemoveAlllDigitsFromString();
		String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
		num.getNumericArr(arr);
	}
}
