package generic;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getkey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}


class ChildPair<K, V> extends Pair<K, V> {

	public ChildPair(K k, V v) {
		super(k, v);

	}

}

class Util {
	public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
		if(p.getkey() == k ) {
			return p.getValue();
		} else {
			return null;
		}
	}
}


//class Util<P, A> {
//	private P p;
//	private A a;
//
//	public P getP() {
//		return p;
//	}
//
//	public void setP(P p) {
//		this.p = p;
//	}
//
//	public A getA() {
//		return a;
//	}
//
//	public void setA(A a) {
//		this.a = a;
//	}
//
//	public static Integer getValue(String pair, String string) {
//		if() {
//			return Integer.parseInt(pair);
//		} 
//		return null;
//	}
//}

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
	}

}
