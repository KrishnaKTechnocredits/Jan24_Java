package lovekesh_mishra;

class BankDetailsAssignment{

               int balance = 1000;
               int DebitAmt;
               int CreditAmt;

               void debitAmt(int amt){
                  if(amt>balance){
                    System.out.println("Insufficient balance");
                } else if(amt<=balance){
                      balance = balance-amt;
                      System.out.println("user debited amount- " + amt + "current balance -" + balance);
                } else if(amt<=0){
                      System.out.println("Invalid amount");
                }
               }

               void creditAmt(int amt){
                  if(amt>5000){
                     System.out.println("You can't deposit more than 5000rs in one go");
                } else if(amt <= 0){
                     System.out.println("Invalid amount");
                }
               }

               public static void main(String[] args){
                 BankDetailsAssignment bankDetailsAssignment = new BankDetailsAssignment();
                 bankDetailsAssignment.debitAmt(2000);
                 bankDetailsAssignment.debitAmt(500);
                 bankDetailsAssignment.debitAmt(-20);
                 bankDetailsAssignment.creditAmt(5500);
                 bankDetailsAssignment.creditAmt(-250);
               }
}