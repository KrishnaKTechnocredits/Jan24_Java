package shramika_vaidya;

class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
	
	void debitAmt(int debitedAmt){
		balance = balance - debitedAmt;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(int creditedAmt){
		balance = balance + creditedAmt;
		creditCount = creditCount + 1;
	}
	
	void printStatment(){
		System.out.println("Current Balance =" + balance);
		printStatmentCount = printStatmentCount + 1;
		}
		
	void printCountInfo(){
		System.out.println("Remaining Balance is " + balance);
		System.out.println("debit method callcount = " + debitCount);
		System.out.println("credit method callCount = " + creditCount);
		System.out.println("printStatment method callCount = " + printStatmentCount);
	}
	
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt(300);
		bankdetail.printStatment();
		bankdetail.creditAmt(500);
		bankdetail.creditAmt(300);
		bankdetail.creditAmt(500);
		bankdetail.printStatment();
		bankdetail.printCountInfo();
	}
}