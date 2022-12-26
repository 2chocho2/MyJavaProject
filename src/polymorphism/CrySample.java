package polymorphism;

class A {
	void print1() {
		System.out.println("A 클래스 print1");

	}

	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class B extends A {
	void print1() {
		System.out.println("B 클래스 print1");

	}

	void print2(int a) {
		System.out.println("B 클래스 print2");
	}

	public class CrySample {

		public static void main(String[] args) {

			A a = new A();
			a.print1();
			a.print2();

			B b = new B();
			b.print1();
			b.print2();
			b.print2(100);

			A c = new B();
			c.print1();
			c.print2();
		}

	}
}
