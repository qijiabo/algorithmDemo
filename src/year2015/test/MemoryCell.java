package year2015.test;

public class MemoryCell {

	private Object cell;
	
	public void write(Object in){
		this.cell=in;
	}
	
	public void write(int in){
		this.cell=new Integer(in);
	}
	
	public Object read(){
		return this.cell;
	}
	
	public static void main(String[] args) {
		MemoryCell c=new MemoryCell();
		c.write(11);
		int value= (Integer) c.read();
		System.out.println(value);
		
	}

}
