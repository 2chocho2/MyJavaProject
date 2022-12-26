package mypack;

public class MyClass {
	
	private int privateInt;
	int packageInt;
	protected int protectedInt;
	public int publicInt;
	
	private void privateMethod() {
		System.out.println(privateInt);
		System.out.println(packageInt);
		System.out.println(protectedInt);
		System.out.println(publicInt);
		
		packageMethod();
		protectedMethod();
		publicMethod();
	}
	void packageMethod() {}
	protected void protectedMethod() {}
	public void publicMethod() {}
}
