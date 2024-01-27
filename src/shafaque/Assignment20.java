package shafaque;

public class Assignment20 {
	void forloop(int num1, int num2) 
	{
		int count = 0;
		for (int i = num1; i < num2; i++)
		{
			if (i % 2 == 0) {
				System.out.println(i);
		        count++;
			}
		        if(count == 5)
		        break;
	}
	}
	

	void whileloop() {
		int num = 0;
		int count = 0;
		while (count < 5) {
			if (num % 2 == 0) {
				System.out.println(num);
			count++;
		}
		num++;
		}
	}

	void doWhileloop() {
		int num = 0;
		int count=0;
		do {
             if (num % 2 == 0) {
				System.out.println(num);
			count++;
		}
		num++;
		}
		while (count < 5);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		System.out.println("For loop");
		assignment20.forloop(10, 20);
		System.out.println("While loop");
		assignment20.whileloop();
		System.out.println("Do While loop");
		assignment20.doWhileloop();
	}

}