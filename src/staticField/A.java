package staticField;

public class A {
	
	final int CONST_NUM_TEN;
	static final int CONST_NUM_NINE;
	
//	void changeFinal() {
//		CONST_NUM_TEN = 100;
//		CONST_NUM_NINE = 99;
//	}
	
	A() {
		CONST_NUM_TEN = 10;
		
	}

	static {
		CONST_NUM_NINE = 9;	
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.CONST_NUM_TEN);
		
		System.out.println(A.CONST_NUM_NINE);
	}
}
