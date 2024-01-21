package pramod;

class Assignment_3_Bank
{
	int bankbalance=1000;
	
	void creditAmt(int amt)
	{
		bankbalance = bankbalance+amt;		
	}
	
	void debitAmt(int amt)
	{
		bankbalance = bankbalance-amt;
	}
	 
	void printBalance()
	{
		System.out.println("Available Balance = "+bankbalance);
	}
	
	public static void main(String args[])
	{
		Assignment_3_Bank a1= new Assignment_3_Bank();
		
		a1.debitAmt(200);
		a1.creditAmt(500);
		a1.creditAmt(200);
		a1.debitAmt(700);
		a1.printBalance();
	}
}

		