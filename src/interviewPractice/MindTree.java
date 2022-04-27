package interviewPractice;

public class MindTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Try this using Stream.
		int[] a = { 1, 2, 3, 4, 5, 10, 15, 16, 17, 20, 25 };
		int[] b = { 5, 6, 7, 8, 9, 10, 16, 20, 21, 22, 25 };

		int count=0;
		for(int c:a) {
			for(int d:b) {
				if(c==d) {
					count++;
					System.out.println(c);
				}
			}
		}
		System.out.println(count);
	}

}
