package interviewPractice;

public class Q13 {

	int maxAttempt;
	
	void Q13() {
		maxAttempt=100;
		System.out.println("in Q13 without args"+maxAttempt);
	}
	
	Q13(int i){
		maxAttempt=i;
		System.out.println("in Q13 with int args: "+maxAttempt);
	}
	
	public static void main(String[] args) {
		Q13 a= new Q13(3);
		Q13 b= new Q13(999);
	}
}
