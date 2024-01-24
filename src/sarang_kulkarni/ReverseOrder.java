/*Assignment - 18 : 23th Jan'2024
2. Print character of given String in reverse order.

input : techno
output :
o
n
h
c
e
t*/

package sarang_kulkarni;

public class ReverseOrder {

	public static void main(String[] args) {
		ReverseOrder rev = new ReverseOrder();
		rev.reverse("techno");
	}
	
	public void reverse(String str) {
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
			
	}
}
