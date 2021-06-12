package Practice;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int temp = 0;
		int co = 0;
		int[] e = new int[count];
		for (int i = 0; i < count; i++) {
			e[i] = sc.nextInt();
		}

		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[j] > e[i]) {
					temp = e[j];
					e[j] = e[i];
					e[i] = temp;
				}
			}
		}
		for (int k = 0; k < e.length; k++) {
			if (e[0] == e[k])
				co++;
		}
		System.out.println(co);
	}
}

/*
 * import java.util.*;
 * 
 * public class Solution { public static void main(String[] args) { Scanner sc =
 * new Scanner(System.in); int n = Integer.parseInt(sc.nextLine()); int[] arr =
 * new int[n];
 * 
 * for (int i = 0; i < n; i++) { arr[i] = Integer.parseInt(sc.next()); }
 * 
 * int count = 1;
 * 
 * int max = arr[0];
 * 
 * for (int i = 1; i < n; i++) { if (arr[i] == max) { count++; }
 * 
 * 
 * if (arr[i] > max) { max = arr[i]; count = 1; } }
 * 
 * System.out.println(count);
 * 
 * 
 * 
 * sc.close();
 * 
 * }
 * 
 * }
 */