/*"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"*/
package sveta;
public class Assignment_61_Sum {

	public void printString(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='-') 
				sum+=(Character.getNumericValue(str.charAt(i+1))*-1);
		}
		System.out.println("Sum of Negative No is -> "+sum);
	}
	
	public static void main(String[] args) {
		String input = "te-3ch4noc7red-8its";
		new Assignment_61_Sum().printString(input);
	}
}
