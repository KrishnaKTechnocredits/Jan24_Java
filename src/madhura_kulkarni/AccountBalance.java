package madhura_kulkarni;

class AccountBalance
{
	int balance=1000;
	
	void debitamount(int amt)
	{
		balance = balance - amt;
	}
	
	void creditamount(int amt)
	{
		balance = balance + amt;
	}
	
	void totalbalance()
	{
		System.out.println("Total balance in account = "+ balance);
	}
	
	public static void main(String[] args)
	{
		AccountBalance accountbalance = new AccountBalance();
		accountbalance.debitamount(300);
		accountbalance.creditamount(600);
		accountbalance.creditamount(800);
		accountbalance.debitamount(400);
		accountbalance.totalbalance();
	}
}