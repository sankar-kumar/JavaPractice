package Practice;

import java.util.Scanner;

public class MatrixDiagonalDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find difference between left diagonal and right diagonal
		// Need to work on this!!!
		Scanner sc = new Scanner(System.in);
		int len = 3, d1 = 0, d2 = 0;
		int ar[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ar[i][j] = sc.nextInt();
				// System.out.print(ar[i]);
				if (i == j)
					d1 += ar[i][j];
			}
		}

		for (int k = 0; k < len; k++) {
			for (int l = len - k - 1; l >= 0; l--) {
				d2 += ar[k][l];
				break;
			}
		}
		sc.close();
		
		System.out.print(Math.abs(d1-d2));
//		System.out.print(d2);
	}

}
