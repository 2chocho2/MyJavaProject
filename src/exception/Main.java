package exception;

class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.println(k + ":" + v);
	}
}

public class Main {
	public static void main(String[] args) {
		
		GenericMethods gm = new GenericMethods();
		
		String s1 = gm.method1("안녕");
		System.out.println(s1);
		
		boolean b1 = gm.method2(2.5, 2.5);
		System.out.println(b1);
		
		gm.method3("국어", 80);
		gm.<String, Integer>method3("국어", 80);
	}
}