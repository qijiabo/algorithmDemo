package year2015.test;

public class TestInstanceOf {
	public static void main(String[] args){
		GenericMemoryCell<Integer> c1=new GenericMemoryCell<Integer>();
		c1.write(11);
		GenericMemoryCell<String> c2=new GenericMemoryCell<String>();
		Object cell=c1;
		c2=(GenericMemoryCell<String>) cell;
		if( c2 instanceof GenericMemoryCell<?>){
			String aa=c2.read();
			System.out.print(aa);
		}
	}
}
