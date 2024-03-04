package aanand.SingletonDesignPattern;

public class BuilderClient {

	public static void main(String[] args) {
		Builder builder1 = Builder.getObject();
		Builder builder2 = Builder.getObject();
		Builder builder3 = Builder.getObject();

		System.out.println(builder1);
		System.out.println(builder2);
		System.out.println(builder3);
	}
}