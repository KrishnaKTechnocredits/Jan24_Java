package akshada_marne;

public class SumOfEvenIndexArray {
		
		void sum(int[] num) {
			
		int sum=0;
			for (int i=0; i<num.length; i++) {

				if(i%2==0) {
					sum=sum+num[i];
				}
			}
			System.out.println(sum);


		}

		public static void main(String args[]) {
			SumOfEvenIndexArray sumOfEvenIndexArray = new SumOfEvenIndexArray();
			int[] arr =   {3, 6, 9, 11, 15, 20, 4, 26};
			sumOfEvenIndexArray.sum(arr);
		}
	}
