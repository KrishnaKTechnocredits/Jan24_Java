package dharma;

public class Assignment77__1MissingNumEx1 {

	void firstMissingNum(int[] arr1) {
		boolean flag = false;
		for(int num = 1; num <= 10; num++) {
			flag = false;
			for(int input : arr1) {
			//for(int input = 1; input < arr1.length; input++) {
				if(num == input) {
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("First missing number is -> " + num);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,1,5,6,9,8,10};
		Assignment77__1MissingNumEx1 ass__1missingnumex1 = new Assignment77__1MissingNumEx1();
		ass__1missingnumex1.firstMissingNum(arr);
	}
}
