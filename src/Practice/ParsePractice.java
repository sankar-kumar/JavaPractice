package Practice;

public class ParsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Integer a=10; a.toString(); System.out.println(a);
		 */
		

        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
	}

}

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}