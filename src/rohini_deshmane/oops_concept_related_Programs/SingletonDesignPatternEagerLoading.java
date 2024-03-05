package rohini_deshmane.oops_concept_related_Programs;

public class SingletonDesignPatternEagerLoading {
	private static SingletonDesignPatternEagerLoading con =
			new SingletonDesignPatternEagerLoading();
	
	private SingletonDesignPatternEagerLoading() {
		System.out.println("Eager loading construtor");
	}
	
	static SingletonDesignPatternEagerLoading getObject() {
		return con;
	}
}
