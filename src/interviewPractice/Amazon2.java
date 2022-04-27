package interviewPractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'fillMissingBrackets' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */
	// For maximum length of input string
	static int MAX = 100;

	// Declaring the DP table
	static int[][][] F = new int[MAX][MAX][MAX];

	public static int fillMissingBrackets(String s) {
		int n = s.length(), res = 0;
		if (n % 2 != 0)
			return res;
		for (int i = 2; i < n; i += 2) {
			// we assume there is no substring with 0 length or full length allowed
			String s1 = s.substring(0, i);
			String s2 = s.substring(i, n);
			if (isBalanced(s1) && isBalanced(s2)) {
				res++;
			}
		}
		return res;
	}

	static boolean isBalanced(String s) {
		// cnt1: []; cnt2: (); cnt3: ?
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == ']') {
				cnt1 += (c == ']') ? -1 : 1;
			} else if (c == '(' || c == ')') {
				cnt2 += (c == ')') ? -1 : 1;
			} else {
				cnt3++;
			}
		}
		int sum = Math.abs(cnt1) + Math.abs(cnt2);
		if (sum == 0) {
			return cnt3 % 2 == 0;
		} else {
			return cnt3 == sum;
		}
	}
}

public class Amazon2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int result = Result.fillMissingBrackets(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
