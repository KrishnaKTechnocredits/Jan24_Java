package gaurav_garg;

public class FreaquencyOfCountAssignment17 {

	int count;

	void freaquencyCount(String freaquency, char abc) {

		for (int i = 0; i < freaquency.length(); i++) {
			// System.out.println(freaquency.charAt(i));
			char n = freaquency.charAt(i);
			if (abc == n) {
				count++;
			}
		}
		System.out.println("freaquecy of " + abc + " in technocredits is " + count);
	}

	public static void main(String[] args) {
		FreaquencyOfCountAssignment17 freaquencyofcountassignment17 = new FreaquencyOfCountAssignment17();
		freaquencyofcountassignment17.freaquencyCount("technocredits", 't');

	}
}
