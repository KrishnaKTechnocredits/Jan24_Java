package madhura_kulkarni;

//Create a call called BankDetail. Instance variable can be,

//balance = 1000, debitCount, creditCount, printStatementCount


//1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, 
//printCountInfo : printCountInfo should print,

//remaining balance

//how many times Debit operation performed

//how many times Credit operation performed

//how many times PrintStatement operation performed

//input : debitAmt(300)
  //      printStatement()
	//	creditAmt(500)
	//	creditAmt(300)
	//	creditAmt(500)
	//	printStatement()
	//	printCountInfo()
		
//output : remaining balance is 700
      //   remaining balance is 2000
        // debit method call count -> 1
      //   credit method call count -> 3
     //    printstatment method call count -> 2
	 
	 
class BankDetails
{
	int balance=1000, debitCount, creditCount, printStatementCount;

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
		System.out.println("Remaining Balance= "+balance);
		printStatementCount++;
	}
	
	void printCountInfo()
	{
		System.out.println("Debit method call count= "+debitCount);
		System.out.println("Credit method call count= "+creditCount);
		System.out.println("Printstatement method call count= "+printStatementCount);
	}
	
	public static void main(String[] args)
	{
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmt(300);
        bankdetails.printStatement();
	    bankdetails.creditAmt(500);
		bankdetails.creditAmt(300);
	    bankdetails.creditAmt(500);
	    bankdetails.printStatement();
	    bankdetails.printCountInfo();
	}

}