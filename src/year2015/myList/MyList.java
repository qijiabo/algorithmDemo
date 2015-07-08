package year2015.myList;

import java.util.Iterator;

public class MyList<AnyType> implements  Iterable<AnyType>{

	private static final int DEFAULT_SIZE=10;
	
	private int theSize;
	
	private AnyType[] arry;
	
	private AnyType get(int index){
		if(index<0||index>DEFAULT_SIZE){
			
		}
		return arry[index];
	}
	
	
	
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
