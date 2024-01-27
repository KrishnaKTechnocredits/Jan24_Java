package lovekesh_mishra;

class DivisibleSumAssignment14{

                     void add(int startindex, int endindex){
                          int sum = 0;
                         for(int num=startindex; num<=endindex; num++){
                            if(num%5==0 && num%10==0){
                                 sum= sum + num;
                        }
                    }
                        System.out.println("expected sum is---->" + sum); 
                }

                   public static void main(String[] args){
                     DivisibleSumAssignment14 divisibleSumAssignment14 = new DivisibleSumAssignment14();
                          divisibleSumAssignment14.add(10, 50);
                }
}