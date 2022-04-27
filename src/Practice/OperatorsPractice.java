package Practice;

public class OperatorsPractice {

	public static void main(String[] args) {
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		for(int i=0;i<5;++i) {
			System.out.println(i);
			++i;
		}

	}

}
