package akshada_marne;

public class LazyLoadingSingletonDesonPattern {

	private static LazyLoadingSingletonDesonPattern con = null;

	private LazyLoadingSingletonDesonPattern() {

	}

	static LazyLoadingSingletonDesonPattern getObject() {
		if (con == null)
			con = new LazyLoadingSingletonDesonPattern();
		return con;
	}
}
