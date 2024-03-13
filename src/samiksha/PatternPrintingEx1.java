package samiksha;

public class PatternPrintingEx1 {
	
	void processData(int row) {
		int count=0;
		for(int i=0;i<=row;i++) {
			count++;
			for(int j=0;j<=i;j++) {
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
	
	void print(int row) {
		for(int i=1;i<=row;i++) {
			for(int j =1;j<=i; j++) {
			  if(i % 2==0) {
			     System.out.print("#" + " ");
			  }else
				  System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//adding one more method out of assignment for my reference only.
	void print1(int row) {
		for(int i=1;i<=row;i++) {
			for(int j =1;j<=i; j++) {
			  if(j % 2==0) {
			     System.out.print("#" + " ");
			  }else
				  System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternPrintingEx1 ex1 =new PatternPrintingEx1();
		ex1.processData(3);
		System.out.println();
		ex1.print(4);
		System.out.println();
		ex1.print1(4);
	}

}
