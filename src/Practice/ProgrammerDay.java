package Practice;

import java.util.Scanner;

public class ProgrammerDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("12.09." + year);
		} else
			System.out.println("13.09." + year);
		sc.close();
	}

}
