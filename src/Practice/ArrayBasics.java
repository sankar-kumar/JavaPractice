package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1D array means single row and multiple elements
		// 2D array means there is multiple rows and multiple columns
		// Just for learning.. Here i implemented jagged array
		int i[][] = { { 12, 1, 1, 4 }, { 1, 4, 99 }, { 55, 88, 33, 44, 66 } };
		int p[] = { 4, 9, 6, 8, 6 };
		List<Integer> intList=new ArrayList<>();
		intList.add(50);
		for (int aa = 0; aa < p.length; aa++) {
			System.out.println(p[aa]);
		}
		for (int j = 0; j < i.length; j++) {
			for (int k = 0; k < i[j].length; k++) {
				System.out.print(i[j][k] + " ");
			}
			System.out.println();
		}
	}

}
