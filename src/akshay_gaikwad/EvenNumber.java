package akshay_gaikwad;

public class EvenNumber{
	void evenNumbers(int startNum , int lastNum){
		System.out.println("Even Numbers are :");
		for (int index=startNum ; index <= lastNum ; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumber evennumber = new EvenNumber();
		evennumber.evenNumbers(10, 15);
	}
}
