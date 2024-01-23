package puja_poreddiwar;

class BankDetail{
	
	int balance= 1000;
	int debitAmt;
	int creditAmt;
	int printStatement;
	
	void debitAmt(int amt)
	{
		System.out.println("Opening balance is " + balance);
		this.balance = balance-amt;
		debitAmt++;
	}
	
	void creditAmt(int amt)
	{
		this.balance = balance + amt;
		creditAmt++;
	}
	void printStatement(){
		System.out.println("remaining balance is " + balance);
		printStatement++;
	}
	
	void printCountInfo()
	{
		System.out.println("debit method call count --> " + debitAmt);
		System.out.println("Credit method call count --> " + creditAmt);
		System.out.println("printstatment  method call count --> " + printStatement);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(300);
		bankDetail.printStatement();
		bankDetail.creditAmt(500);
		bankDetail.creditAmt(300);
		bankDetail.creditAmt(500);
		bankDetail.printStatement();
		bankDetail.printCountInfo();
		
	}
	
}