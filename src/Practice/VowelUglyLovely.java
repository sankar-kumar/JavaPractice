package Practice;

import java.util.Scanner;

public class VowelUglyLovely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Get the int input to get the no. of input strings you need to check.. if the
		 * string contains a,A,e,E,i,I,o,O,u,U its a lovely string if the string dosen't
		 * contains the Vowels its an Uglystring
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n;i++) {
			String name=sc.next();
			if(isVowel(name)) {
				System.out.println("Lovely string");
			}
			else
				System.out.println("UglyString");
		}
	}
	
	public static boolean isVowel(String ch) {

		if (ch.contains("a") && ch.contains("A") && ch.contains("e") && ch.contains("E") && ch.contains("i")
				&& ch.contains("I") && ch.contains("o") && ch.contains("O") && ch.contains("u") && ch.contains("U"))
			return true;
		else
			return false;

	}

}
