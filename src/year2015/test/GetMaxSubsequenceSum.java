package year2015.test;

public class GetMaxSubsequenceSum {
	
	
	public static void main(String[] args){
		int[] a ={-2, 11 ,-4 ,13, -5 -2};
		int[] b={-6 ,2 ,4 ,-7 ,5 ,3 ,2 ,-1 ,6 ,-9 ,10 ,-2};
		System.out.println("1:"+GetMaxSubsequenceSum1(b));
		System.out.println("2:"+GetMaxSubsequenceSum2(b));
	}
	
	/**
	 * 获得最大子序列和问题
	 * 遍历所有可能性，O(N^3)
	 * @return
	 */
	private static int GetMaxSubsequenceSum1(int[] arry){
		int maxNum=0,tmpSum=0,i,j,k;
		for(i=0;i<arry.length;i++){
			for(j=i;j<arry.length;j++){
				tmpSum=0;
				for(k=i;k<j;k++){
					tmpSum+=arry[k];
					if(tmpSum>maxNum){
						maxNum=tmpSum;
					}
				}
			}
		}
		return maxNum;
	}
	
	
	/**
	 * 对方法1进行优化
	 * 保存计算过的值
	 * 运行时间为 O(N^2) 
	 * @param arry
	 * @return
	 */
	private static int GetMaxSubsequenceSum2(int[] arry) {
		int maxNum = 0, tmpSum = 0, i, j;
		for (i = 0; i < arry.length; i++) {
			tmpSum=0;
			for (j = i; j < arry.length; j++) {
				tmpSum += arry[j];//将之前计算过的arry[0]~arry[j]的和保存起来
				if (tmpSum > maxNum) {
					maxNum = tmpSum;
				}
			}
		}
		return maxNum;
	}
	
	/**
	 * 分治法
	 */
	
	
}
