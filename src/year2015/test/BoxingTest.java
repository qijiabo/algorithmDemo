package year2015.test;

public class BoxingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericMemoryCell<Integer> cell=new GenericMemoryCell<Integer>();
		cell.write(66);
		int ai=cell.read();
	}

}
