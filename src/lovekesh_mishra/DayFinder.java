package lovekesh_mishra;

class DayFinder{

             void day(int dayindex){
                 if(dayindex>=1 && dayindex<=5){
                 System.out.println("it is a weekday");
                 if(dayindex==1)
                 System.out.println("Monday");
                 else if(dayindex==2)
                 System.out.println("tuesday");
                 else if(dayindex==3)
                 System.out.println("wednesday");
                 else if(dayindex==4)
                 System.out.println("thursday");
                 else if(dayindex==5)
                 System.out.println("friday");
               }
                 else if(dayindex>=6 && dayindex<=7){
                 System.out.println("it is weekend");
                 if(dayindex==6)
                 System.out.println("saturday");
                 else if(dayindex==7)
                 System.out.println("sunday");
               }
                 else{
                 System.out.println("Invalid index");
               }
              }

             public static void main(String[] args){
             DayFinder dayFinder = new DayFinder();
                dayFinder.day(2);
                dayFinder.day(6);
                dayFinder.day(11);
                dayFinder.day(-3);
               }
}