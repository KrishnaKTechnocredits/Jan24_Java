package shraddha;

class Sum1{

	void createSum(){
		int sum = 0;
		int num = 1;
		int count = 0;
		while(sum <= 150){
			if(num%6==0){
				sum = sum+num;
				count++;
			}
			num++;
		}
		System.out.println("count of numbers whos sum is 150 and are divisible by 6 is: "+count);
	}
	
	public static void main(String[] args){
		Sum1 sum = new Sum1();
		sum.createSum();
	}
}