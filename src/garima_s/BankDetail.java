package garima_s;

class BankDetail
{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(int amount)
	{
		balance = balance - amount;
		debitCount++;
	}
	
	void creditAmount(int amount)
	{
		balance = balance +	amount;
		creditCount++;
	}
	
	void printStatement()
	{
		System.out.println("Bank Balance = "+ balance);
		printStatementCount++;
	}
	
	void printCountInfo()
	{
		System.out.println("Remaining Balance = "+ balance);
		System.out.println("Count of debitAmount Operation = "+ debitCount);
		System.out.println("Count of creditAmount Operation = "+ creditCount);
		System.out.println("Count of printStatement Operation = "+ printStatementCount);
	}
	
	public static void main(String[] args)
	{
		BankDetail	bankDetail= new BankDetail();
		bankDetail.debitAmount(300);
		bankDetail.printStatement();
		bankDetail.creditAmount(500);
		bankDetail.creditAmount(300);
		bankDetail.creditAmount(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}

}