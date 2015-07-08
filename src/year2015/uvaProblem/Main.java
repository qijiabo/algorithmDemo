/**
 * 
 */
package year2015.uvaProblem;

import java.io.BufferedInputStream;
import java.util.Scanner;

class Main {
	public static void main(String[] args)  {
		Main p1=new Main();
		Scanner br = new Scanner(new BufferedInputStream(System.in));
		 while (br.hasNextInt()) {  
		     int a = br.nextInt(), b = br.nextInt();
            int re=p1.getLoopLength(a,b);
            System.out.println(a+" "+b+" "+re);
        }
	}
	
	public int getLoopLength(int min,int max){
		//if min > max then return 0
		int maxLoop=0;
		int tmpLoop=0;
		//loop from min to max  get the max 3n+1 loop
		for(int k=min<max?min:max;k<=max||k<=min;k++){
			tmpLoop= goOneLoop(0,k);
			if(tmpLoop>maxLoop){
				maxLoop=tmpLoop;
			}
		}
		return maxLoop;
	}
	
	public int goOneLoop(int sum,int n){
		if(n==1){
			sum++;
			return sum;
		}else{
			if(n%2==0){
				n=n>>1;
			}else{
				n=3*n+1;
			}
			sum++;
			return goOneLoop(sum,n);
		}
	}
}



