package rohini_deshmane.oops_concept_related_Programs;

public class SingletonDesignPatternEagerLoading {
	private static final SingletonDesignPatternEagerLoading con =
			new SingletonDesignPatternEagerLoading();
	
	private SingletonDesignPatternEagerLoading() {
		
	}
	
	static SingletonDesignPatternEagerLoading getObject() {
		return con;
	}
	
	public static void main(String[] args) {
		System.out.println("Singleton EagerLoading \n");
		SingletonDesignPatternEagerLoading eagerloading = SingletonDesignPatternEagerLoading.getObject();
		System.out.println(eagerloading);
		
		SingletonDesignPatternEagerLoading eagerloading1 = SingletonDesignPatternEagerLoading.getObject();
		System.out.println(eagerloading1);
		
		SingletonDesignPatternEagerLoading eagerloading2 = SingletonDesignPatternEagerLoading.getObject();
		System.out.println(eagerloading2);
	}
}
