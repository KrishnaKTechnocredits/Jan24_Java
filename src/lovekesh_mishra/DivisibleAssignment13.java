package lovekesh_mishra;

class DivisibleAssignment13{
                   
                   void lastNumber(int startindex, int endindex){
                           int count=0;
                        for(int num=startindex; num<=endindex; num++){
                           if(num%5==0 && num%9==0){
                               count= num;
                   }
                }
                      System.out.println("last number divisible by 5 & 9 is---->" + count);
               }

                    public static void main(String[] args){
                       DivisibleAssignment13 divisibleAssignment13 = new DivisibleAssignment13();
                            divisibleAssignment13.lastNumber(5, 100);
                    }
}