package lovekesh_mishra;

class DivisibleAssignment11{

                 void divisible(int startindex, int endindex){
                        for(int num=startindex; num<=endindex; num++){
                           if(num%5==0 && num%3==0){
                            System.out.println("Divisible number are--" + num);
                        }
                   }
               }

                  public static void main(String[] args){
                   DivisibleAssignment11 divisibleAssignment11 = new DivisibleAssignment11();
                      divisibleAssignment11.divisible(5, 40);
               }
}
                   