package nikita_patil;

public class Assignment79 {
	void digitPrint1(int n) {
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
	
	void digitPrint2(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment79 a= new Assignment79();
		a.digitPrint2(4);
		System.out.println();
		a.digitPrint1(5);
	}

}
