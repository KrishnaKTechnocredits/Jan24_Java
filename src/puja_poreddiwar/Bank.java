package puja_poreddiwar;

class Bank{
	int balance=1000;
	void debitAmt(int num1)
	{
		balance = balance-num1;
	}
	
	void creditsAmt(int num1)
	{
		balance = balance+num1;
	}
	void printBalance(){
		System.out.println("Current balance is = " + balance);
	}
	public static void main(String[] args){
		Bank bank1=new Bank();
		bank1.debitAmt(200);
		bank1.creditsAmt(500);
		bank1.creditsAmt(200);
		bank1.debitAmt(700);
		bank1.printBalance();
	}
}


