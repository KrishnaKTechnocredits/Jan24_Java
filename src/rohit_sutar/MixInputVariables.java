package rohit_sutar;

class MixInputVariables{

	int a = 10;
	int b = 20;
	static int c = 100;
	
	void m1(){
		int a = 20;
		int b = 40;
	}
	
	public static void main(String args[]){
		MixInputVariables mixInputVariables1 = new MixInputVariables();
		MixInputVariables mixInputVariables2 = new MixInputVariables();
		MixInputVariables mixInputVariables3 = new MixInputVariables();
		
		mixInputVariables1.b = 40;
		mixInputVariables2.a = 50;
		mixInputVariables3.c = 10;
		
		System.out.println(mixInputVariables1.a + mixInputVariables2.b + mixInputVariables2.c);
	}
}