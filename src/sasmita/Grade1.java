package sasmita;

public class Grade1 {
	void printGrade(int score){
		if(score < 0 || score >100){
			System.out.println("invalid score");
		}
		else if (score >= 90){
			System.out.println("A");
		}else if (score >= 80){
			System.out.println("B");
		}else if (score >= 70){
		    System.out.println("c");
		}else if (score >= 60){
			System.out.println("c");
		}
		System.out.println("Hi");
	}	
		public static void main(String[]args){
		 Grade1 grade = new Grade1();
		 grade.printGrade(101);
		 grade.printGrade(70);
		 grade.printGrade(-10);
		 System.out.println("Hello");
	 }
}

