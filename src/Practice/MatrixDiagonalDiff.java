package Practice;

import java.util.Scanner;

public class MatrixDiagonalDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		find difference between left diagonal and right diagonal
		Scanner sc = new Scanner(System.in);
		int len = 3, sum = 0;
		int ar[] = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ar[i] = sc.nextInt();
//				System.out.print("* ");
				if (j % 2 == 0) {
					sum = sum + ar[i];
				}
			}
		}
		System.out.println(sum);

	}

}
