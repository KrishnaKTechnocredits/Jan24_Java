/*Assignment - 32 : 4th Feb'2024	

Print all the given int array in the reverse order.

input : {10, 20, 13, 27, 29, 13, 6}
Output : 6
		 13
		 29
		 27
		 13
		 20
		 10*/

package madhura_kulkarni;

public class Assignment32 {
	
	 void printArrayInReverseOrder (int[] input){
		 System.out.println("Input string is : ");
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		System.out.println("String after reversal is: ");
		for(int index=input.length-1;index>=0;index--) {
			System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		int[] arr= {10,20,13,27,29,13,6};
		Assignment32 revarr= new Assignment32();
		revarr.printArrayInReverseOrder(arr);
	}

}
