package atisha;

 //prrint all the int array in the reverse order
 class Assignment32 {
	void printReverseArr(int[] arr) {
		for(int index = arr.length-1; index >= 0; index--) {
			System.out.print(arr[index] + ", ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 13, 27, 29, 13, 6};
		new Assignment32().printReverseArr(arr);
	}
}

