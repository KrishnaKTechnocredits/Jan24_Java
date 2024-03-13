package hiral_purohit;

/*Program 1: Find out first missing number from 1 to 10.
  *Program 3 : Find out all missing number from 1 to 10.
int[] x = {2,4,1,5,6,9,8,10};
output : 3*/
public class Assignment_77 {

	void toFindfirstMissingNum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("missing first numbers in array is " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		new Assignment_77().toFindfirstMissingNum(x);

	}
}
