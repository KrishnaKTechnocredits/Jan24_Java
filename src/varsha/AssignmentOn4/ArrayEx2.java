package varsha.AssignmentOn4;

//Assignment - 33 : 4th Feb'2024
//
//Return the sum of all given array of double type.
//
//input :{10.20, 45.50, 34.65, 20.60, 25.46, 78.90}
//Output : 215.31

public class ArrayEx2 {

	double printSumOfDoubleNum(double[] d) {
		double sum = 0;
		for (int index = 0; index < d.length; index++) {
			sum = sum + d[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayEx2 arrayEx2 = new ArrayEx2();
		double[] d = { 10.20, 45.50, 34.65, 20.60, 25.46, 78.90 };
		double d1 = arrayEx2.printSumOfDoubleNum(d);
		System.out.println("Total of given array is : " + d1);
	}
}