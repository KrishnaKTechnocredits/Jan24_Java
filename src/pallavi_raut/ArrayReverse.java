/*Assignment - 32 : 4th Feb'2024	

Print all the given int array in the reverse order.

input : {10, 20, 13, 27, 29, 13, 6}
Output : 6
		 13
		 29
		 27
		 13
		 20
		 10---------------------------------------------------*/	
package pallavi_raut;
class ArrayReverse{
		
		public static void main(String[] args){
			int[] arr= {10, 20, 13, 27, 29, 13, 6};
			new ArrayReverse(). printArrayReverse (arr);
		}	
		
		void printArrayReverse(int[] num){
			for ( int index= (num.length)-1; index >= 0; index --){
				System.out.println (num[index]);
			}	
		}
}