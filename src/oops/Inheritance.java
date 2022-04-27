package oops;

@FunctionalInterface 
 
interface Methods {
	void print();

	default String hell(String s) {
		System.out.println(s);
		return s;
	}
	
//	String badBoy(String as);
}

class Parent implements Methods {
	public void print() {
		System.out.println("Print in Parent");
	}
}

class Child implements Methods {
	public void print() {
		System.out.println("Print in Child");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods a = () -> System.out.println("Print in Tadaaa");
		a.print();
		a.hell("Wanted to test Something");
		Parent p = new Parent();
		p.print();
		Child c = new Child();
		c.print();

	}

}
