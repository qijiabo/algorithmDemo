package year2015.uvaProblem;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main2 {  //Ҫ��Main��class���Q
	 
	  public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedInputStream(System.in));
	    while (in.hasNextInt()) {  //��Mݔ�룬���ʹ��ޒȦ���xȡ�Y��
	      int a = in.nextInt(), b = in.nextInt(), max = 0, temp = 0;
	      for (int i = (a < b) ? a : b; i <= a || i <= b; ++i) {
	        if ((temp = cycleLength(i, 1)) > max)
	          max = temp;
	      }
	      System.out.println(a + " " + b + " " + max);  //ֻ��ӡ���𰸼���
	    }
	  }
	 
	  public static int cycleLength(int num, int len) {
	    if (num == 1)
	      return len;
	    return cycleLength(((num & 1) == 1) ? (3 * num + 1) : (num >> 1), ++len);
	  }
	 
	}