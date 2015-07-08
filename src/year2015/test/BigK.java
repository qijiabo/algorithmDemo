package year2015.test;

import year2015.date0512.SelectSort;

public class BigK {
	public static void main(String[] args){
		BigK bk=new BigK();
		int[] aa={1,2,3,9,8,7,6,5,4};
		int kk=bk.returnBigK(aa, 1);
		System.out.print(kk);
	}
	
	public  int returnBigK(int[] arr,int k){
		if(k>arr.length||k<=0){
			return 0;
		}
		int[] arrK=new int[k];
		//��ǰk��Ԫ�ط�������
		for(int i=0;i<k;i++){
			arrK[i]=arr[i];
		}
		//ǰk��Ԫ������
		arrK=SelectSort.selectSort_A2a(arrK);
		//SelectSort.printIntArr(arrK);
		//����k��Ԫ��һһ�������飬�������k�������ȷλ��
		//���������������д�С���е�����������
		for(int i=k;i<arr.length;i++){
			arrK=putValueIntoArr(arrK,arr[i]);
		}
		return arrK[k-1];
	}
	
	public int[] putValueIntoArr(int[] arrK,int value){
		if(arrK[arrK.length-1]>=value){
			return arrK;
		}
		int pos=0;
		for(int i=arrK.length-1;i>=0;i--){
			if(arrK[i]<value){
				continue;
			}else{
				pos=i+1;
				break;
			}
		}
		if(pos==arrK.length-1){
			arrK[arrK.length-1]=value;
			return arrK;
		}
		int [] reArr=new int[arrK.length];
		for(int i=0;i<arrK.length;i++){
			if(pos==i){
				reArr[i]=value;
			}else if(i>pos){
				reArr[i]=arrK[i-1];
			}else{
				reArr[i]=arrK[i];
			}
		}
		return reArr;
	}
}
