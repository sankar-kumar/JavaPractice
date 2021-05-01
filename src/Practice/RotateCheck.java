package Practice;

public class RotateCheck {
	public static void main(String args[]) {
		//we have to add the second str twice to compare the first string
		String s1="race";
		String s2="cera";
		String s3=s2+s2;
		if(s3.contains(s1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
