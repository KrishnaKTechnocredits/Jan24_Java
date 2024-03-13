package samiksha;

public class BuilderClient {

	public static void main(String[] args) {
		Builder build1 = Builder.getObject();
		Builder build2 = Builder.getObject();
		Builder build3 = Builder.getObject();

		System.out.println(build1);
		System.out.println(build2);
		System.out.println(build3);
	}
}
