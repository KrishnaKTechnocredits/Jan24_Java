package lovekesh_mishra;

class NumberAssignment{
                  
                    void bigNumber(int num1, int num2){
                      if(num1 > num2){
                      System.out.println(num1 + " is bigger than" + num2);
                    } else if(num1 < num2){
                      System.out.println(num2 + " is bigger than" + num1);
                    }
                }

                    void smallNumber(int num1, int num2){
                      if(num1 < num2){
                      System.out.println(num1 + " is smaller than" + num2);
                    } else if(num1 > num2){
                      System.out.println(num2 + " is smaller than" + num1);
                    }
                }

                    public static void main(String[] args){
                    NumberAssignment numberAssignment = new NumberAssignment();
                      numberAssignment.bigNumber(10, 17);
                      numberAssignment.smallNumber(10, 17);
                }
}