package shafaque;

class Student {
 int sno = 10;
 String name= "Technocredit";
 
 void display()
 {
   System.out.println(sno);
   System.out.println(name);
}
public static void main(String[] args){
	Student s = new Student();
	s.display();
}
}
