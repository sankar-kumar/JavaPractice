package interviewPractice;

import java.util.Scanner;

public class ArithmicSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			float count=0;
			float num=1/i;
			System.out.println(num);
			count+=num;
		}

	}

}
