//    1           *  
//    2 2         # # 
//    3 3 3       * * *  
//    4 4 4 4     # # # #

package atisha;

public class Assignment79 {
	public static void main(String[] args) {
		System.out.println("pattern->1");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println("pattern->2");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}

			}
			System.out.println();
		}
	}
}
