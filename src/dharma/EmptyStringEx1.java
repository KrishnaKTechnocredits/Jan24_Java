package dharma;

public class EmptyStringEx1 {

	void emptyString(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty string, no character found");
		}
	}
	
	public static void main(String[] args) {
		new EmptyStringEx1().emptyString("");
	}

}
