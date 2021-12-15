package lambdaPractice;

// Diff between using anonymous class and lambda expression. its a basic example
//Without anonymous class
public class BasicWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citrusfruits cit = (lemonCount, orangeCount) -> (lemonCount + orangeCount);
		System.out.println(cit.totalCitrusFruits(10, 20));

	}

}

interface Citrusfruits {
	int totalCitrusFruits(int lemonCount, int orangeCount);
}

//With anonymous class
/*
 * public class BasicWorking { public static void main(String[] args) {
 * Citrusfruits cit = new Citrusfruits() { public int totalCitrusFruits(int
 * lemonCount, int orangeCount) { return (lemonCount + orangeCount); } };
 * System.out.println(cit.totalCitrusFruits(5, 10)); } }
 */