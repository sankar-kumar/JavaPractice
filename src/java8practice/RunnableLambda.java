package java8practice;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implementing Runnable using Lambda expression


		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Implementation without Lambda Expressions");
			}
		}).start();
		 

		// With Lambda Expression

//		new Thread(() -> System.out.println("Implementation with Lambda Expression")).start();
	}

}
