package dharma;

public class StringReverse {

	public void printAllNum(String name) {
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		sr.printAllNum("techno");
	}

}
