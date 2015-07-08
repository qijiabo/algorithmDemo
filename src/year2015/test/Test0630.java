package year2015.test;

import java.util.Date;

public class Test0630 {

	public static void main(String[] args){
		long l1=new Date().getTime();
		fib(2);
		long l2=new Date().getTime();
		System.out.println(l2-l1);
	}
	
	private static long fib(long n){
		if(n<=1){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
}
