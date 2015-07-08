package year2015.date0512;


public class SelectSort {
	public static void main(String[] args){
		int[] a={5,2,3,4,5,5,5,66,3,-40404,-3,-4};
		long startL=System.nanoTime();
		a=selectSort_A2a(a);
		long endL=System.nanoTime();
		System.out.println("useTime:"+(endL-startL));
		for(int i=0;i<a.length;i++){
			System.out.print(","+a[i]);
		}
	}
	
	public static int[] selectSort_a2A(int[] inArr){
		int size=inArr.length;
		for(int k=0;k<size;k++){
			int min_v=inArr[k];
			int min_index=k;
			for(int i=k+1;i<size;i++){//循环一次得到最小值下标
				if(inArr[i]<min_v){
					min_index=i;
					min_v=inArr[i];
				}
			}
			//交换
			int a=inArr[min_index];
			inArr[min_index]=inArr[k];
			inArr[k]=a;
		}
		return inArr;
	}
	
	public static int[] selectSort_A2a(int[] inArr){
		int size=inArr.length;
		for(int k=0;k<size;k++){
			int min_v=inArr[k];
			int min_index=k;
			for(int i=k+1;i<size;i++){//循环一次得到最大值下标
				if(inArr[i]>min_v){
					min_index=i;
					min_v=inArr[i];
				}
			}
			//交换
			int a=inArr[min_index];
			inArr[min_index]=inArr[k];
			inArr[k]=a;
		}
		return inArr;
	}
	
	public static void printIntArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	
}
