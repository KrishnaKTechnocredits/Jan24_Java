package ankita_s;

public class BuilderConnection {
	private static BuilderConnection con = new BuilderConnection();

	private BuilderConnection() {
	}

	void updateQuery() {
	}

	static BuilderConnection getobject() {
		return con;
	}

	public static void main(String[] args) {
	}
}
