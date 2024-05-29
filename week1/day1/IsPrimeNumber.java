package week1.day1;

public class IsPrimeNumber {
	public static void main(String[] args) {
		boolean prime=false;
		int n=19;
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0) {
					System.out.println("Its not a Prime Number");
					prime=true;
					break;
			}
		}
		if(!prime)
					System.out.println("Its a Prime Number");
	}

}
