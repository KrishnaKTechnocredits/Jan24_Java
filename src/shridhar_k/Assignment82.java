package shridhar_k;
// String str = "I am having 11 years and 3 months of experience in java selenium";
// output : 14
// NOTE : use Exception concept
//9.34 - 9.45

class Assignment82 {
    void processData(String str){
        int temp = 0;
       String[] strArr = str.split(" ");
       for(int i =0;i<strArr.length;i++){
            try{
                temp += Integer.parseInt(strArr[i]); 
            }catch(NumberFormatException ae){
                continue;    
       }
   } 
    System.out.println("output : " + temp);    
}
    public static void main(String[] arg){
        String inp = "I am having 11 years and 3 months of experience in java selenium";
        new Assignment82().processData(inp);
    }
}