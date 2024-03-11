package dharma;

public class Assignment_77_LastMissingNumEx1 {

	int LastMissingNum(int[] arr1) {
		boolean flag = false;
		int temp = 0;
		for(int num = 1; num <= 10; num++) {
			flag = false;
			for(int i = 0; i < arr1.length; i++) {
				if(num == arr1[i]) {
					flag = true;
					break;
				}
			}
			if(flag == false)
				temp = num;
		}
		if(temp == 0) {
			System.out.println("All numbers are present in Array");
		}else {
			System.out.println("Last missing number is -> " + temp);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assignment_77_LastMissingNumEx1 ass_77_lastmissingnumex1 = new Assignment_77_LastMissingNumEx1();
		ass_77_lastmissingnumex1.LastMissingNum(arr);
	}
}
