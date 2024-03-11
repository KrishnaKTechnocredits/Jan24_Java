package akshada_marne;

public class EarlyLoadingClientClass {
	public static void main(String args[]) {

		EagerLoadingSingletonDesignPattern con1 = EagerLoadingSingletonDesignPattern.getObject();

		EagerLoadingSingletonDesignPattern con2 = EagerLoadingSingletonDesignPattern.getObject();

		System.out.println(con1);

		System.out.println(con2);

	}
}