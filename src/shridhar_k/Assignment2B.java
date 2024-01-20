package shridhar_k;

class Assignment2B{
	
	int balance = 1000;
	
	void debitBalance(int num){
		balance = balance - num;		
	}
	
	void creditBalance(int num){
		balance = balance +	num;
	}
	
	void printBalance(){
		System.out.println("Yours balance is " + balance);
	}
	
	public static void main(String[] arg){
		Assignment2B assignment2B = new Assignment2B();
		assignment2B.debitBalance(200);
		assignment2B.creditBalance(500);
		assignment2B.creditBalance(200);
		assignment2B.debitBalance(700);
		assignment2B.printBalance();
	}
}