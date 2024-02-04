package shraddha;

class PrimeNumbers{
	Boolean isPrimeNum(int num){
		int count=0;
		for (int i=2;i<num;i++){
			if(num%i==0){
			count++;
			break;
			}
		}
			if(count==0){
				System.out.println(num+" is a primeNumber");
					return true;
			}
			return false;
	}
	
	void setRange(int startRange,int endRange){
		int sum = 0;
		for (int num=startRange;num<endRange;num++){
			boolean flag = isPrimeNum(num);
			if(flag == true)
				sum = sum + num;
		}
		System.out.println("Sum of all Prime numbers is: "+sum);
	}	
	
	public static void main(String[] args){
		PrimeNumbers prime = new PrimeNumbers();
		prime.setRange(10,30);
		
	}
}