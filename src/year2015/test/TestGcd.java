package year2015.test;

public class TestGcd {

	
	private static long gcd(long a ,long b){
		while(b!=0){
			long rem=a%b;
			a=b;
			b=rem;
		}
		return a;
	}
	
	public static void main (String[] args){
		System.out.print(gcd(2,1));
	}
}
