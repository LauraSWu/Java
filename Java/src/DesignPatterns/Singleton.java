package DesignPatterns;

public class Singleton {
	
	private static Singleton theOnlyInstance = null;

	//add other public class members here
	public String s;
	
	//private constructor for the class
	private Singleton() {
		s = "Singleton string";
	}
	
	//returns theOnlyInstance using "lazy initialization"
	public static Singleton getInstance() {
		if (theOnlyInstance == null) {
			theOnlyInstance = new Singleton();
		}
		return theOnlyInstance;
	}
	
	/* for multi-threaded programs, use can use either:
	 1. Synchronized keyword in getInstance method:
	 
		public static synchronized Singleton getInstance() {

	 2. Optional helper - anonymous inner class
	 	Note: This always creates a singleton class, does not use "lazy initialization"

		 public static class SingletonHelper(){
		 	private static final Singleton innerInstance = new Singleton();
		 }
		 
		 public static Singleton getInstance(){
		 	return singletonHelper.innerInstance;
		 }

	 */
	
}
