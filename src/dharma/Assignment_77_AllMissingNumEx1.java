package dharma;

public class Assignment_77_AllMissingNumEx1 {

	void allMissingNum(int[] arr1) {
		boolean flag = false;
		for(int num = 1; num <= 10; num++) {
			flag = false;
			for(int i = 0; i < arr1.length; i++) {
				if(num == arr1[i]) {
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("All missing number -> " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assignment_77_AllMissingNumEx1 ass77_allmissingnumex1 = new Assignment_77_AllMissingNumEx1();
		ass77_allmissingnumex1.allMissingNum(arr);
	}
}
