package rohini_deshmane;

class BankDetailCondition {
    int balance = 1000;
    int debitCount, creditCount, printcount;

    void debitAmt(int amt){
        if(amt > balance) {
            System.out.println("Insufficient Balance");
        } else if (amt <= 0) {
            System.out.println("Invalid Amount");
        } else if(amt <= balance) {
            balance = balance-amt;
            System.out.println("User Debited = "+amt+" Available Balance = "+balance);
        }
    }

    void creditAmt(int amt){
        if(amt > 5000) {
            System.out.println("You can't deposite more than 5000 Rs in one go");
        } else if(amt <= 0) {
            System.out.println("Invalid Amount");
        } else {
            balance = balance+amt;
            System.out.println("Total balance = "+balance+" Credited amount = "+amt);
        }
    }

    public static void main(String args[]) {
        BankDetailCondition bank = new BankDetailCondition();
        bank.debitAmt(2500);
        bank.debitAmt(-34);
        bank.creditAmt(7000);
        bank.debitAmt(500);
        bank.creditAmt(-400);
        bank.creditAmt(3000);
    }
}