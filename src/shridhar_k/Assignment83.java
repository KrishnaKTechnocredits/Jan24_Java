package shridhar_k;
//
// I__am___in_pune____
// Output:
// I -> 2
// am -> 3
// in -> 1
// pune -> 4
// Use this editor to write, compile and run your Java code online
// 9:00 -9.13

class Assignment83 {
    void processData(String str){
        String tempStr = "";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(count>0){
                    System.out.println(tempStr +" -> "+ count);
                    tempStr = "";
                    count = 0;
                }
                tempStr += ch;
            }else{
                count++;
            }
        }
        if(!tempStr.isEmpty()){
            System.out.println(tempStr +" -> "+ count);
        }
    }
    public static void main(String[] arg){
        String inp = "I__am___in_pune____";
        new Assignment83().processData(inp);
    }

}