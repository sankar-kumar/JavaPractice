package Practice;

import java.util.Scanner;

public class XyPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 1, b = 2, c = 3, d = 6;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		a += b;
		b += a;

		if (a == c && b == d) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

	/*
	 * private static int addPoints(int i, int j) { // TODO Auto-generated method
	 * stub int k = i + j; addPoints(k, j); return k; }
	 */

}
