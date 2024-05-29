package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int number = 10;
		int a=0;
		int b=1;
		
		for (int i=1; i<=number; i++) {
			System.out.println(a);
			int add=a+b;
			a=b;
			b=add;
			
		}
	}

}
