package puja_poreddiwar;

class Student{
		int rno=10;
		String name = "Puja";
		
		void display()
		{
			System.out.println(rno);
			System.out.println(name);
		}
		
		void processdata()
		{
			rno=1;
		}
		
		public static void main(String[] args)
		{
			Student S = new Student();
			S.display();
			S.processdata();
			S.display();
		}
		
}