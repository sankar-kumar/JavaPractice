package Practice;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Hello Boss! Welcome Back. What Can I Do for you?\n";
		String R = "Thanks Buddy. Whats the time?";
		System.out.println(S.charAt(0));
		System.out.println(new StringBuilder().append(R).append(S));
		String Q = S.concat(R);
		System.out.println(Q);
	}

}
