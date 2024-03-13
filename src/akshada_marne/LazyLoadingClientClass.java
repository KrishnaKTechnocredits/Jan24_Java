package akshada_marne;

public class LazyLoadingClientClass {

	public static void main(String args[]) {
		LazyLoadingSingletonDesonPattern con1 = LazyLoadingSingletonDesonPattern.getObject();
		LazyLoadingSingletonDesonPattern con2 = LazyLoadingSingletonDesonPattern.getObject();

		System.out.println(con1);
		System.out.println(con2);

	}
}
