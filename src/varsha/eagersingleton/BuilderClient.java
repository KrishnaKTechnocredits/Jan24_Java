package varsha.eagersingleton;

public class BuilderClient {

	public static void main(String[] args) {
		Builder b1 = Builder.getConnection();
		Builder b2 = Builder.getConnection();
		Builder b3 = Builder.getConnection();

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
