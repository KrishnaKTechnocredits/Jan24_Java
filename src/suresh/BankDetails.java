package suresh;

class BankDetails
{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatmntCount;
	
	void debitAmount(int amt)
	{
		balance = balance - amt;
		debitCount++;
	}
	
	void creditAmount(int amt)
	{
		balance = balance + amt;
		creditCount++;
	}
	
	void printStatmnt()
	{
		System.out.println("The current balance is "+ balance);
		System.out.println("The debit count is "+debitCount);
		System.out.println("The credit count is "+creditCount);
		System.out.println("The print StatmentCount is "+printStatmntCount);
		
		printStatmntCount++;
	}
	public static void main(String[] args)
	{
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(200);
		bankDetails.printStatmnt();
		bankDetails.debitAmount(50);
		bankDetails.printStatmnt();
		bankDetails.debitAmount(10);
		bankDetails.printStatmnt();
		bankDetails.creditAmount(500);
		bankDetails.printStatmnt();
		bankDetails.creditAmount(70);
		bankDetails.printStatmnt();
		bankDetails.creditAmount(80);
		bankDetails.printStatmnt();
	}
}
		
		
	
	
	