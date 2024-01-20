package ankita_s;

class Student{
 int rno = 5401;
 String name = "Ankita";

 void display(){
  System.out.println(rno);
  System.out.println(name);
 }
 
 public static void main(String[] args){
  Student s=new Student();
  s.display();
 }
}
