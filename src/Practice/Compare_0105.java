package Practice;

import java.util.Scanner;

public class Compare_0105 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		int index = 3, i;
		Scanner sc = new Scanner(System.in);
		int alice[] = new int[index];
		int bob[] = new int[index];
		for(i=0; i<index; i++) {
			alice[i] = sc.nextInt();
		}
		for(i=0; i<index; i++) {
			bob[i] = sc.nextInt();
		}
		for(i=0; i<alice.length; i++) {
			if(alice[i] < bob[i]) {
				b++;
			}
			else if(alice[i] > bob[i]) {
				a++;
			}
		}
		System.out.println(a+" "+b);
	}
}
