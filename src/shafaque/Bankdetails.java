package shafaque;

class Bankdetails
{
    int balance =1000;
	int debitCount,creditCount,printcount,printStatementcount;
	 
	void debitAmt(int amt)
	{
	  balance = balance - amt;
	  debitCount++;
	}
	 void creditAmt(int amt)
	{
	 balance = balance + amt;
	 creditCount++;
	}
	void printStatement()
	{
	 System.out.println("Balance is " + balance);
	 printStatementcount++;
    }
	void printCountInfo()
	{
	 System.out.println("Remaining Balance = " + balance);
	 System.out.println("Debit method call count = " + debitCount);
	 System.out.println("credit method call count = " + creditCount);
	 System.out.println("printstatment method call count = " + printStatementcount);
	} 
	public static void main(String args[])
	{
	 Bankdetails bankdetails = new Bankdetails();
	 bankdetails.debitAmt(300);
     bankdetails.printStatement();
     bankdetails.creditAmt(500);
	 bankdetails.creditAmt(300);
	 bankdetails.creditAmt(500);
	 bankdetails.printStatement();
	 bankdetails.printCountInfo();
	}
}
	
	  