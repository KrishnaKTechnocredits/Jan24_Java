//Program 1: Find out first missing number from 1 to 10.
//int[] x = {2,4,1,5,6,9,8,10};
//output : 3
//Program 2 : Find out last missing number from 1 to 10.
//int[] x = {2,4,1,5,6,9,8,10};
//output : 7
/*Program 3 : Find out all missing number from 1 to 10.
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 */

package shridhar_k;

public class Assignment77 {
	
	void findFirstMissingNum(int[] arr) {
		
		for(int j =1;j <=10;j++) {
			boolean flag = false;
			
			for(int i =0;i<arr.length;i++) {
				int n = arr[i];
				if(j == n) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("first missing number" + j);
				break;
			}
		}
	}
	
	void findLastMissingNum(int[] arr) {
		System.out.println("");
		for(int j=10;j>=1;j--) {
			boolean flag = false;
			for(int i = arr.length-1;i>=0;i--) {
				if(arr[i] == j) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("last missing number"+ j);
				break;
			}
		}
	}
	
	void findAllMissingNum(int[] arr) {
		System.out.println("");
		System.out.println("All missing number");
		for(int j =1;j<=10;j++) {
			boolean flag = true;
			for(int i =0;i<arr.length;i++) {
				if(arr[i]==j) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] x = {2,4,1,5,6,9,8,10};
		new Assignment77().findFirstMissingNum(x);
		new Assignment77().findLastMissingNum(x);
		new Assignment77().findAllMissingNum(x);
	}
}
