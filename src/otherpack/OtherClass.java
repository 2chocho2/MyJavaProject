package otherpack;

import mypack.MyClass;

public class OtherClass {

	public static void main(String args[]) {
		MyClass myclass = new MyClass();
//		myclass.packageInt = 10;
//		myclass.protectedInt = 10;
		myclass.publicInt = 10;
		
//		myclass.packageMethod();
//		myclass.protectedMethod();
		myclass.publicMethod();
	}
}
