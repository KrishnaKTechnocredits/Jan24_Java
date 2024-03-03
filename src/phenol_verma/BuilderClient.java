package phenol_verma;

public class BuilderClient {

	private static BuilderClient conn = new BuilderClient();

	private BuilderClient() {
		System.out.println("Eager Loading Implemantation");
	}

	public static BuilderClient getObject() {
		return conn;
	}
}
