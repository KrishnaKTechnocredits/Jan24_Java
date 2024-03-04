package rupali_umagol;

public class BuilderClient {

	public static void main(String[] args) {
		
		Builder b1=Builder.getObject();
		Builder b2=Builder.getObject();
		Builder b3=Builder.getObject();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
}
