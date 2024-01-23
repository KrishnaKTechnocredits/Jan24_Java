/* Assignment - 18 : 23th Jan'2024 
 Print character of given String in reverse order.*/

package prathamesh_tati;

public class StringInReverseOrder {

	void reverseOrderString(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.println(str.charAt(index));

		}
	}

	public static void main(String[] args) {
		StringInReverseOrder stringInReverseOrder = new StringInReverseOrder();
		stringInReverseOrder.reverseOrderString("techno");
	}
}