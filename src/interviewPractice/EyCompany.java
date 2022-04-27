package interviewPractice;

public class EyCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inputC2H7
//		output CCHHHHHHH
		String s1="C2H7";
		String a=s1.substring(0,1);
		int b=Integer.parseInt(s1.substring(1,2));

		for(int i=0;i<b;i++) {
			System.out.print(a);
		}
	}

}
