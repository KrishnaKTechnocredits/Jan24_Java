package dharma;

public class StringEx1 {
	
	public void frequency(String str, char c) {
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(c==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of t in technocredits is" + count);
	}

	public static void main(String[] args) {
		StringEx1 se = new StringEx1();
		se.frequency("technocredits teaches Technology",'t');
	}
}
