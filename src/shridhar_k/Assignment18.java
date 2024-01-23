//Print character of given String in reverse order.
package shridhar_k;

public class Assignment18 {
	void printCharInReverse(String inputString){
		System.out.println("Output");
		for(int index=inputString.length()-1;index>=0;index--){
			System.out.println(inputString.charAt(index));
		}
	}
	
	public static void main(String[] arg){
		Assignment18 assignment18 = new Assignment18();
		String inputString = "techno";
		System.out.println("Input: " + inputString);
		assignment18.printCharInReverse(inputString);
	}
}
