package sveta;

public class Assignment_20_EvenNo {

	public void whilePrint() {
		System.out.println("using While :");
		int count = 0;
		int i=1;
		while(count<5) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
	
	public void forprint() {
		System.out.println("using for :");
		int count=1;
		for (int i=2;count<=5;i++) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
	public void doWhilePrint() {
		System.out.println("using Do while:");
		int i=1;
		int count=0;
		do {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}while(count<5);
	}
	public static void main(String[] args) {
		Assignment_20_EvenNo even = new Assignment_20_EvenNo();
		even.whilePrint();
		even.forprint();
		even.doWhilePrint();

	}

}
