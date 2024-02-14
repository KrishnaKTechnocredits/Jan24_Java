package kanchan_ghuge;

/*Assignment - 32 : 4th Feb'2024	

Print all the given int array in the reverse order.

input : {10, 20, 13, 27, 29, 13, 6}
Output : 6
		 13
		 29
		 27
		 13
		 20
		 10 */
		 
class Assignment32{ 
    
    void printArray(int[] num){
	    for(int index=num.length-1;index>=0;index--){
		    System.out.println(num[index]);
		}	
	}
	
	public static void main(String[] args){
	    int[] arr = {10, 20, 13, 27, 29, 13, 6};
		new Assignment32().printArray(arr);
	}
}	

    