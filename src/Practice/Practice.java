package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			int a = sc.nextInt();
			String s = sc.next();
			int count = 0;
			// need to add code for last case
			if (a == 1) {
				System.out.println("0");
			}
			else {
				for (int j = 1; j < a; j++) {
					if (((s.charAt(j - 1) != 'a') || (s.charAt(j - 1) != 'e') || (s.charAt(j - 1) != 'i')
							|| (s.charAt(j - 1) != 'o') || (s.charAt(j - 1) != 'u'))
							&& (s.charAt(j) == ('a') || s.charAt(j) == ('e') || s.charAt(j) == ('i')
									|| s.charAt(j) == ('o') || s.charAt(j) == ('u'))) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}