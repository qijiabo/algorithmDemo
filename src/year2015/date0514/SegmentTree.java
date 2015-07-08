package year2015.date0514;

public class SegmentTree {
	/**
	 * Ïß¶ÎÊ÷
	 * @param args
	 */
	private static int MAX_COUNT=10;
	private Tree[] nodes=new Tree[MAX_COUNT];
	
	public int pos=0; 
	
	public SegmentTree(){
		for(int i=0;i<MAX_COUNT;i++){
			nodes[i]=new Tree();
		}
	}
	
	//
	
	public Tree build(int L,int R){
		Tree root=nodes[pos++];
		root.min=L;
		root.max=R;
		if(L==R){
			root.maxScore=Math.max(L, R);
			return root;
		}else{
			int mid;
			mid=(L+R)/2;
			root.L=build(L,mid);
			root.R=build(mid+1,R);
			root.maxScore=Math.max(root.L.maxScore, root.R.maxScore);
		}
		return root;
	}
	
	public int query(Tree root ,int LL,int RR){
		if(root.min==LL&&root.max==RR){
			return root.maxScore;
		}else{
			int mid;
			mid=(root.min+root.max)/2;
			// in the left half tree 
			if(RR<=mid){
				return query(root.L,LL,mid);
			// right half
			}else if(LL>mid){
				return query(root.R,mid+1,RR);
			}else{
				return  Math.max(query(root.L,LL,mid), query(root.R,mid+1,RR)); 
			}
		}
	}
	
	public int update(Tree root,int LL,int value){
		if(root.min==LL||root.max==LL){
			return root.maxScore=value;
		}else{
			int mid;
			mid=(root.min+root.max)/2;
		}
		return 0;
	}
	
	
	public void printTree(Tree a ){
		if(a!=null){
			printTree(a.L);
			System.out.print("["+a.min+",max:"+a.maxScore+","+a.max+"]");
			printTree(a.R);
		}
	}
	
	public static void main(String[] args) {
		SegmentTree tree=new SegmentTree();
		Tree a=tree.build(1, 4);
		//tree.printTree(a);
		int max=tree.query(a, 2,3);
		System.out.print(max);
	}

}

class Tree{
	public int min;
	public int max;
	public Tree L;
	public Tree R;
	public int maxScore;
}
