package dharma;

public class Numbers {

	public void even(int start,int end) {
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Numbers no = new Numbers();
		no.even(10, 15);

	}

}
