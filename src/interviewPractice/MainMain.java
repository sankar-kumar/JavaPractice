package interviewPractice;


import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//@SuppressWarnings("deprecation")
public class MainMain {

	int a=10;
	static {
		int a=100;
	}
	
	public static void main(String[] args) {   
		/*
		 * int r = 0, c = 0, num, b; Scanner sl = new Scanner(System.in);
		 * System.out.println("Enter a number"); num = sl.nextInt(); b = num; while (num
		 * > 0) { if ((num % 10 == 0) || (num % 10 == 1)) c++; r++; num = num / 10; } if
		 * (c == r) System.out.println(b + " is a Binary Number."); else
		 * System.out.println(b + " is not a Binary Number");
		 */

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		MainMain a=new MainMain();
		System.out.println(a.a);
		 

		// Really a useful way dont delete it.
		/*
		 * List<Character> chars = Arrays.asList('s','s','s','a','n','s');
		 * Map<Character, Long> map = chars.stream().map(c -> c)
		 * .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		 * System.out.println(map);
		 */

		/*
		 * Observable.range(1, 5).subscribe( number -> System.out.println(number), error
		 * -> System.out.println("error"), () -> System.out.println("completed") );
		 */
		/*
		 * // defining the source
		 * 
		 * @SuppressWarnings("deprecation") Observable<Integer> source =
		 * Observable.range(1, 5); // defining the consumer Subscriber<int> consumer =
		 * new Subscriber<int>() {
		 * 
		 * @Override public void onNext(Integer number) { System.out.println(number); }
		 * 
		 * @Override public void onError(Throwable e) { System.out.println("error"); }
		 * 
		 * @Override public void onCompleted() { System.out.println("completed"); } };
		 * // connecting the consumer to source source.subscribe(consumer);
		 */
	}

}
