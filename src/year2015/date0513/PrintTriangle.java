package year2015.date0513;

public class PrintTriangle {
	public static void main(String[] args){
		int n=9;
		PrintTriangle pt=new PrintTriangle();
		pt.printTriangle(n);
	}
	
	public void printTriangle(int n){
		for(int i=n ;i>0;i--){
			printLine(i);
		}
	}
	
	private void printLine(int k){
		for(int i=0;i<k;i++){
			System.out.print("@");
		}
		System.out.print("\n");
	}
}
