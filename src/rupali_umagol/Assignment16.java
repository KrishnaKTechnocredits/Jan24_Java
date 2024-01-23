package rupali_umagol;

public class Assignment16 {
	void averageresult(int startIndex, int endIndex) {
		int sum=0;
		int count=0;
		for(int num=startIndex; num<endIndex; num++) {
			if(num%5==0 && num%7==0) {
				sum=sum+num;
				count++;
				System.out.println(num);
			}
		}
		System.out.println("Found 3 numbers which are divisible by 5 & 7");
		System.out.println("sum :" + sum);
		System.out.println("Average : "+ (sum/count));		
	}

	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		System.out.println("Numbers are :");
		assignment16.averageresult(1,110);
	}
}
