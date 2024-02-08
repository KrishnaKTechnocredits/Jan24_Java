package lovekesh_mishra;

class BankDetailsAssignment6{

	int balance = 1000;
	int debitAmt;
	int creditAmt;

	void debit(int amt){
                        if(amt>= balance){
                      System.out.println("insufficient balance");
                      } else if(amt<0){
                        System.out.println("invalid amount");
                     } else if(amt<=balance){
                         System.out.println("user debited --- "+amt);
                     }
                 }

	void credit(int amt){
                         if(amt>5000){
                          System.out.println("you can't deposit rs 5000 in one go");
                         } else if(amt<0) {
                            System.out.println("invalid amount");
                      }
                }

	public static void main(String[] args) {
		BankDetailsAssignment6 bankDetailsAssignment6 = new BankDetailsAssignment6();
		bankDetailsAssignment6.debit(1500);
		bankDetailsAssignment6.debit(-20);
		bankDetailsAssignment6.debit(800);
		bankDetailsAssignment6.credit(5500);
		bankDetailsAssignment6.credit(-150);
	}
}





