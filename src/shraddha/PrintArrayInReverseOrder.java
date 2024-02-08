package shraddha;

/*Assignment - 32 : 4th Feb'2024	

Print all the given int array in the reverse order.*/

class PrintArrayInReverseOrder{
	void reverseArray(int[] input){
		for(int i=input.length-1;i>=0;i--)
			System.out.println(input[i]);
	}
	
	public static void main(String[] args) {
		PrintArrayInReverseOrder reverse = new PrintArrayInReverseOrder();
		int[] input={10,20,30,40,50};
		reverse.reverseArray(input);
	}
}