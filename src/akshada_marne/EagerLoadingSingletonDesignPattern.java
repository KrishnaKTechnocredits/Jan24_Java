package akshada_marne;

public class EagerLoadingSingletonDesignPattern {

	private static EagerLoadingSingletonDesignPattern con = new EagerLoadingSingletonDesignPattern();

	private EagerLoadingSingletonDesignPattern() {

	}

	static EagerLoadingSingletonDesignPattern getObject() {
		return con;
	}

}
