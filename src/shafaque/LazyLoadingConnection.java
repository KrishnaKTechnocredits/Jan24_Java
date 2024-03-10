package shafaque;

public class LazyLoadingConnection {

	private static LazyLoadingConnection con;

	private LazyLoadingConnection() {

	}

	static LazyLoadingConnection getobject() {
		if (con == null)
			con = new LazyLoadingConnection();
		return con;
	}
}