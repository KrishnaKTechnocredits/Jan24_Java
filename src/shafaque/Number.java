package shafaque;

class Number{
  int num1 = 10;
  int num2 = 17;
  
  void maxnum(int num1 ,int num2)
  {
    if (num1 < num2)
	{
	 System.out.println(num2 + " is bigger between 10 and 17");}
	 
	else{
	 System.out.println(num2 + " is bigger between 10 and 17.");}
	 
  }
  
  void minnum(int num1 ,int num2)
  {
   if (num1 > num2)
   {
     System.out.println( num2 + " is smaller between 10 and 17");
    }
	 
	else{
	 System.out.println(num1 + " is smaller between 10 and 17");}
	 
  }
  public static void main(String[] args)
	{
	 Number number = new Number();
	 number.maxnum(10,17);
	 number.minnum(10,17);
	}
}
   
	 