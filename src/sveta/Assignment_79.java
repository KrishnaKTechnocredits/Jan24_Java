package sveta;

public class Assignment_79 {

	void digitPrint2(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	void digitPrint1(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment_79 assignment_79 = new Assignment_79();
		assignment_79.digitPrint1(4);
		System.out.println();
		assignment_79.digitPrint2(5);
		

	}

}
