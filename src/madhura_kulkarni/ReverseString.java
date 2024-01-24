/*"Assignment - 18 : 23th Jan'2024
2. Print character of given String in reverse order.

input : techno
output :
o
n
h
c
e
t"
*/
package madhura_kulkarni;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reversestr= new ReverseString();
		reversestr.stringreversal("Madhura");
	}

	void stringreversal(String input)
	{
		System.out.println("Input string is: "+input);
		int len=input.length();
		System.out.println("Output string is: ");
		for(int index=len-1; index>=0; index--)
		{
			char ch=input.charAt(index);
			System.out.println(ch);
		}
			
	}
}
