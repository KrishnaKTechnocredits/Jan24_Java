package nikita_patil;

public class Programmingtest {
   public static void main(String[] args) {
   String s ="te3ch4nocred8its";
   String s1 ="te2chn6ocred8its";
   int sum=0;
   for (int i = 0; i < s1.length(); i++) {
      if(Character.isDigit(s1.charAt(i))) 
      sum=sum+Character.getNumericValue(s1.charAt(i));
      }
   System.out.println("Sum of all the digit present in String : "+sum);
  }
}