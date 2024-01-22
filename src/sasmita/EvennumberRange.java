package sasmita;

public class EvennumberRange {
	
	void evenNumber() {
		for(int index=10;index<=15;index++) {
			if(index%2 == 0) {
				System.out.println(index);
			}
		}
	}
	public static void main(String[]args) {
		EvennumberRange even = new EvennumberRange();
		even.evenNumber();
	}
}
