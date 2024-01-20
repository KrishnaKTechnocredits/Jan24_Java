package garima_s;

class BankBalance
{
	int balance=1000;
	
	void debitAmount(int amount)
	{
		balance = balance - amount;
	}
	
	void creditAmount(int amount)
	{
		balance = balance +	amount;
	}
	
	void printBalance()
	{
		System.out.println("Bank Balance = "+ balance);
	}
	
	public static void main(String[] args)
	{
	BankBalance	bankBalance= new BankBalance();
	bankBalance.debitAmount(200);
	bankBalance.creditAmount(500);
	bankBalance.creditAmount(200);
	bankBalance.debitAmount(700);
	bankBalance.printBalance();
	}

}
