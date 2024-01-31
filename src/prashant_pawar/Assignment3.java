package prashant_pawar;

class Assignment3{
	int balance=1000;
	
	void debitAmt(int amt){
		balance=balance-amt;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
	}
	
	void printBalance(){
		System.out.println("Bank Balance is-:" + balance);
	}
	
	public static void main(String[] args)
	{
		Assignment3 assignmnet=new Assignment3();
		assignmnet.debitAmt(200);
		assignmnet.creditAmt(700);
		assignmnet.creditAmt(70);
		assignmnet.debitAmt(100);
		assignmnet.printBalance();
		
	}	
}	





















