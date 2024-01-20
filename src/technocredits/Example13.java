package technocredits;

class Example13{
	
	void printGrade(int score){
		if(score < 0 || score > 100){
			System.out.println("Invalid score");
		}
		else if(score >= 90){
			System.out.println("A");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}
		System.out.println("Hi");
	}
	
	void m1(int score){
	
	}
	
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.printGrade(110);
		System.out.println("Hello");
	}
}

