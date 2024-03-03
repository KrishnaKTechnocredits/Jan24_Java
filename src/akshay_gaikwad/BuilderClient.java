package akshay_gaikwad;

public class BuilderClient {

	public static void main(String[] args) {
		
		Builder builder1 = Builder.getObject();
		Builder builder2 = Builder.getObject();
		
		System.out.println(builder1);
		System.out.println(builder2);
	}
}
