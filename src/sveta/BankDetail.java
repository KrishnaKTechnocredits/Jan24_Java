package sveta;
class BankDetail{

    int balance = 1000;
	int DebitAmt;
	int CreditAmt;
	
	void DebitAmt(int amt){
		if (amt > balance){
			System.out.println("Insufficient Balance.");
		} else if(amt <= 0){
			System.out.println("Invalid amount.");
		} else if(amt <= balance){
			System.out.println("User debited : " + amt);
		}
	}

	void CreditAmt(int amt){
		
		if (amt > 5000)
		{
			System.out.println("You can't deposite more than 5000 rs in one go");
		} 
		else if(amt <= 0)
		{
			System.out.println("Invalid amonut");
		}
	}

	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.DebitAmt(3000);
		bankdetail.DebitAmt(500);
		bankdetail.DebitAmt(-30);
		bankdetail.CreditAmt(5900);
		bankdetail.CreditAmt(-20);
	}
}
	


