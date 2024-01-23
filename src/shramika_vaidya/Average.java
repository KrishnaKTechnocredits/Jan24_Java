package shramika_vaidya;

class Average{
	
	void setData(int startNum,int endNum){
		int count=0;
		int sum=0;
		for(int num=startNum;num<=endNum;num++){
			if(num%5==0 && num%7==0){
				count++;
				System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println("found "+ count+" no which are divisible by 5 and 7");
		System.out.println("Sum = "+sum);
		System.out.println("Average = " +sum/count);
	}
		
	public static void main (String [] args){
		Average average = new Average();
		average.setData(1,110);
	}
}