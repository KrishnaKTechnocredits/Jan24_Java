package shravani_rapelli;

public class Assignment77 {

	void firstMissingNumber(int arr[]) {
		for(int n=1; n<=10; n++) {
			boolean flag = false;
		for(int i=0; i<arr.length;i++) {
			if (n == arr[i]) {
				flag = true;
				break;
			}
		}
			if (flag == false) {
				System.out.println("First missing number from array is : " + n);
				break;
			}
		}
	}
	
	void LastMissingNumber(int[] arr) {
		int temp = 0;
		for (int n = 1; n<= 10; n++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (n == arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp = n;
			}
		}
		if (temp == 0)
			System.out.println("All numbers are present in the array");
		else
			System.out.println("Last missing number from array is :" + temp);

	}

	void AllMissingNumber(int[] arr) {
		for (int n = 1; n <= 10; n++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (n == arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(" Missing Numbers from Array are : "+ n);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment77 assgn77 = new Assignment77();
		int[] x = {2,4,1,5,6,9,8,10};
		assgn77.firstMissingNumber(x);
		assgn77.LastMissingNumber(x);
		assgn77.AllMissingNumber(x);
	}

}
