
/*Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
*/
package sveta;
public class Assignment9_EvenNo {

	public void evenNo(int start, int end) {
		for(int i = start;i<=15;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Assignment9_EvenNo even = new Assignment9_EvenNo();
		System.out.println("Even Numbers are :");
		even.evenNo(10, 15);
	}

}
