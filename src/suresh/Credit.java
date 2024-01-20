package suresh;

class Credit
{
  void credamt(int amt)
  {
    if(amt>5000)
    {
      System.out.println("You cant deposit more than 5000 rs in one go");
    }else if(amt<0)
    {
      System.out.println("Invalid amount");
    }
  }
  void debitamt(int damt)
  {
    int bal=5000;
    if(damt>bal)
    {
      System.out.println("Insufficient balance");
    }
	else if(damt<=0)
    {
      System.out.println("Invalid amount");
    }
  else if(damt<=bal)
    {
  
      System.out.println("User debited "+damt);
    }
  }

 public static void main(String[] args)
 {
   Credit credit= new Credit();
   credit.credamt(6000);
   credit.debitamt(0);
 }

}