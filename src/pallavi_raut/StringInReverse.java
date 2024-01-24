/*Assignment - 18 : 23th Jan'2024
2. Print character of given String in reverse order.
input : techno
output :
o
n
h
c
e
-----------------------------------------------------------------------------------*/
package pallavi_raut;

class StringInReverse{

	void printStringrev(String str){
		for (int index = str.length()- 1; index >= 0; index--) {
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[] args){
		StringInReverse strRev = new StringInReverse();
		strRev.printStringrev("techno");
	}
}
