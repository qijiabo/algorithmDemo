package year2015.test;

public class GenericMemoryCell<AnyType> {

	private AnyType cell;
	
	public void write(AnyType in){
		this.cell=in;
	}
	
	public AnyType read(){
		return this.cell;
	}
	
	public static void main(String[] args) {
	}

}
