package nikita_patil;

public class Assignment78 {

	void patternPrint1(int n) {
		for (int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void patternPrint2(int n) {
		for (int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void digitPrint2(int n) {
		int temp=0;
		for (int i=1;i<=n+1;i++) {
			for(int j=1;j<i;j++) {
				temp++;
				System.out.print(temp +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment78 a= new Assignment78();
		a.patternPrint1(4);
		a.patternPrint2(6);
		a.digitPrint2(4);

	}

}
