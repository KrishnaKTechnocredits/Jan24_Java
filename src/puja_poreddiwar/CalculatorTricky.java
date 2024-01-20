package puja_poreddiwar;

class CalculatorTricky{
	
	int answer;
	void test1(int num1, int num2)
	{
		int temp = num1+ num2;
		answer=answer+temp;
		System.out.println("answer1 = " + answer);
	}
	
	void test2(int num1, int num2)
	{
		int temp=num1-num2;
		answer= answer+temp;
		System.out.println("answer2 = " + answer);
	}
	
	void test3(int num1, int num2)
	{
		int temp = num1*num2;
		answer=answer+temp;
		System.out.println("answer3 = " + answer);
	}
	
	void test4(int num1, int num2)
	{
		int temp=num1/num2;
		answer=answer+temp;
		System.out.println("answer4 = " +answer);
	}
	
	void sumOfAll()
	{
		System.out.println("Sum = " + answer);
	}
	public static void main(String[] args){
		CalculatorTricky CT1=new CalculatorTricky();
		CT1.test1(10,20);
		CT1.test2(100,80);
		CT1.test3(10,50);
		CT1.test4(11,11);
		CT1.sumOfAll();
	}
}