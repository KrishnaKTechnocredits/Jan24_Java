package prathamesh_tati;

class StudentGrade{
		
	void printGrade(int score){
		if(score > 100){
			System.out.println("Invalid Score");
		}
		
		if(score >=90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >=60){
			System.out.println("D");
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.printGrade(110);
		System.out.println("Hello");
	}
		
}