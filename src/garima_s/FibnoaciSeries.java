package garima_s;

public class FibnoaciSeries {
	
	void getFibnoaciNumUpto10(int number) {
		int temp=0;
		int num=1;
		int sum=0;
		System.out.println(temp);
		for(int i=2;i<number;i++) {
			sum=temp+num;
			temp=num;
			num=sum;
			System.out.println(sum);	
		}
	}
	
	void getFibnoaciNumTill100(int number) {
		int temp=0;
		int num=1;
		int sum=0;
		System.out.println(temp);
		for(int i=2;i<number;i++) {
			sum=temp+num;
			temp=num;
			num=sum;
			if(sum<100) {
			System.out.println(sum);
			
			}
		}
	}
	
	void getFibnoaciNum50And100(int number) {
		int temp=0;
		int num=1;
		int sum=0;
		for(int i=2;i<number;i++) {
			sum=temp+num;
			temp=num;
			num=sum;
			if(sum>50&&sum<100) {
			System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) {
		FibnoaciSeries fibnoaciSeries=new FibnoaciSeries();
		System.out.println("Fibnoiaci Seriers first 10 Numbers : ");
		fibnoaciSeries.getFibnoaciNumUpto10(10);
		System.out.println("Fibnoiaci Seriers before 100 : ");
		fibnoaciSeries.getFibnoaciNumTill100(30);
		System.out.println("Fibnoiaci Seriers Between 50 and 100 : ");
		fibnoaciSeries.getFibnoaciNum50And100(30);
	}
}
