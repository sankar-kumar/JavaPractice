package interviewPractice;

class Test {
	void show() {
		System.out.println("Show in test class");
	}
}

public class Q2 extends Test {

	void show() {
		System.out.println("show in Q2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show();
		Q2 q = new Q2();
		q.show();
		t = q;
		t.show();
		q = (Q2) t;
		q.show();

	}

} 