package Practice;

import java.util.Scanner;

public class LongSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt(),i;
		long sum=0;
		long ar[]=new long[len];
		for(i=0;i<len;i++) {
			ar[i]=sc.nextInt();
			sum=sum+ar[i];		
		}
		System.out.println(sum);

	}

}
