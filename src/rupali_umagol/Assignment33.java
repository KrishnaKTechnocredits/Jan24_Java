package rupali_umagol;

public class Assignment33 {
	double sumAll(double[] values) {
		double sum=0;
		for(int i=0;i<values.length;i++) {
			sum=sum+values[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment33 assignment33=new Assignment33();
		double[] arr= {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		double sum=assignment33.sumAll(arr);
		System.out.println(sum);
	}
}