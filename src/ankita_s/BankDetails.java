package ankita_s;

class BankDetails{
	int balance = 1000;
	
	void debitAmt(int amt){
		if (amt>balance)
		{
			System.out.println ("Insufficient balance");
		}
		else if (amt<=0)
		{
			System.out.println ("Invalid Amount");
		}
		else if (amt<balance)
		{
			System.out.println("Debited amount is:- " + amt);
		}
	}

	void creditAmt(int amt){
		if (amt>=5000)
		{
			System.out.println ("You can't deposite more than 5000 rs in one go");
		}
		else if (amt<=0)
		{
			System.out.println("Invalid Amount");
		}
	}

	public static void main (String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmt(3000);
		bankdetails.debitAmt(-300);
		bankdetails.debitAmt(400);
		bankdetails.creditAmt(6000);
		bankdetails.creditAmt(-300);
	}
}

