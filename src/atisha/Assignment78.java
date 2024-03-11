//*     1             1
//**    1 2           2 3
//***   1 2 3         4 5 6
//****  1 2 3 4       7 8 9 10
//      1 2 3 4 5
//      1 2 3 4 5 6
package atisha;

public class Assignment78 {
	public static void main(String[] args) {
		System.out.println("pattern->1");
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*' + "");
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println("pattern->2");
		for (int i = 0; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println("pattern->3");
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}
}
