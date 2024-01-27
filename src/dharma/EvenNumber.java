package dharma;

public class EvenNumber {
	
	public void evenno(int start, int end) {
		for(int i=start;i<=20;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
		
	public static void main(String[] args) {
		EvenNumber en = new EvenNumber();
		en.evenno(11, 20);
		System.out.println("Even Numbers are");
	}

}
