/*Assignment - 77 : 9th March'2024
Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3

Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7

Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 */
package sveta;

public class Assignment_77 {

	void GetFirstMissingNo(int arr[]) {
		int temp=0;
		boolean flag;
		for(int i=1;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				temp=i;
				break;
			}
		}
		System.out.println("First Missing No is ->" +temp);
	}
	
	void GetMissingLastNo(int arr[]) {
		int temp=0;
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				temp=i;
				
			}
		}
		System.out.println("Last missing No is ->"+temp);
	}
	
	void GetMissingAllNo(int arr[]) {
		System.out.print("All missing No :");
		boolean flag;
		for(int i=1;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_77 ass77= new Assignment_77();
		int[] input = {2,4,1,5,6,9,8,10};
		ass77.GetFirstMissingNo(input);
		System.out.println("---------------------------");
		ass77.GetMissingLastNo(input);
		System.out.println("---------------------------");
		ass77.GetMissingAllNo(input);
	}

}
