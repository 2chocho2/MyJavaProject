
class Person {
private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	 public boolean equals(Object obj) {
	       if(obj instanceof Person) {
	    	   Person person = (Person) obj;
	    	   if (person.name == this.name) {
	    		   return true;
	    	   }
	       }
	       return false;
	    }
	
}


public class EqualTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		
		Person p3 = p1;
		System.out.println(p3.hashCode());
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
	}

}
