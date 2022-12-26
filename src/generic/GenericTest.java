package generic;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class GenericTest {

	static void method1(Goods<A> g) {}
	static void method2(Goods<?> g) {}
	static void method3(Goods<? extends B> g) {}
	static void method4(Goods<? super B> g) {}
	
	
	
	public static void main(String[] args) {
		
		method1(new Goods<A>()); //method1(Goods<A> g)
//		method1(new Goods<B>());
//		method1(new Goods<C>());
//		method1(new Goods<D>());
		
		method2(new Goods<A>()); //method2(Goods<?> g)
		method2(new Goods<B>());
		method2(new Goods<C>());
		method2(new Goods<D>());
		
//		method3(new Goods<A>()); //method3(Goods<? extends B> g)
		method3(new Goods<B>());
		method3(new Goods<C>());
		method3(new Goods<D>());
		
		method4(new Goods<A>()); //method4(Goods<? super B> g)
		method4(new Goods<B>());
//		method4(new Goods<C>());
//		method4(new Goods<D>());
		method4(new Goods<Object>());
	}

}
