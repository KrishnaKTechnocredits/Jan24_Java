package gaurav_garg;
class BankDetailAssignment5
{
	int balance = 1000;
	int debitCount,creditCount,printStatementCount;
	void debitAmt(int n)
	{
		balance =balance -n;
		debitCount = debitCount +1;
	}
	void creditAmt(int n)
	{
		balance=balance+n;
		creditCount = creditCount+1;
	}
	void printStatement()
	{
		System.out.println("remaining balance is " + balance);
		printStatementCount = printStatementCount +1;
	}
	void countInfo()
	{
		System.out.println("debit method call count->" +debitCount);
		System.out.println("credit method call count->" +creditCount);
		System.out.println("printStatement method call count->" +printStatementCount);
	}
	
	public static void main(String...s)
	{
		BankDetailAssignment5 bankdetailassignment5 =new BankDetailAssignment5();
		bankdetailassignment5.debitAmt(300);
		bankdetailassignment5.printStatement();
		bankdetailassignment5.creditAmt(500);
		bankdetailassignment5.creditAmt(300);
		bankdetailassignment5.creditAmt(500);
		bankdetailassignment5.printStatement();
		bankdetailassignment5.countInfo();
	}
	
	
	
	
	
	
}

