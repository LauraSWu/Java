package DesignPatterns;

public class Singleton {
	
	private static Singleton theOnlyInstance = null;
	
	//add other public class members here
	
	private Singleton() {
		//private constructor for the class
	}
	
	public static Singleton getInstance() {
		if (theOnlyInstance == null) {
			theOnlyInstance = new Singleton();
		}
		return theOnlyInstance;
	}
}
