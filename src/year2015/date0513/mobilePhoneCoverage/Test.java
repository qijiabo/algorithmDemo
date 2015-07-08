package year2015.date0513.mobilePhoneCoverage;

public class Test {
	public static void main(String[] args){
		Antenna a=new Antenna(1,1,1);
		System.out.print(a.getCoverage());
	}
	
	
	private double getTwoAntennaArea(Antenna a,Antenna b){
		double sum=0;
		double[] axl=a.getXPoint();
		double[] bxl=b.getXPoint();
		double a1=axl[0];
		double a2=axl[1];
		
		double b1=bxl[0];
		double b2=bxl[1];
		
		
		
		return sum;
	}
}
