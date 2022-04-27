package oops;

import java.util.ArrayList;

interface Anim{
	void m1();
//	void m2();
}

public class Inherittt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Object o=new Object(); String s=(String) o;
		 */
		A a = new B();
		B b = (B) a;
//		B c=new B();
		a.m1();
		a.m3();
		b.m1();
//		c.m1();
		Anim anim = () -> System.out.println("Lambda implemented");
		anim.m1();

	}

}

/*
 * ArrayList <String> obj = new ArrayList(); ArrayList <String> obj1 = new
 * ArrayList<String>();
 */



class A /* implements Anim */{
	protected void m1(){
		System.out.println("m1 method");
	}
	void m3() {
		System.out.println("Added some method without mentioning it in interface.");
	}
}

class B extends A{
	public void m1(){
		System.out.println("m2 method");
	}
}