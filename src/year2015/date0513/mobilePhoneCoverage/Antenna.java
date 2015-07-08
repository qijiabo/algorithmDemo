package year2015.date0513.mobilePhoneCoverage;

public class Antenna {
	
	
	//构造方法
	public Antenna(double _x,double _y ,double _r){
		this.x=_x;
		this.y=_y;
		this.r=_r;
	}
	
	private double x=0,y=0,r=0;
	
	public double[] getXPoint(){
		double[] re=new double[1];
		re[0]=x-r;
		re[1]=x+r;
		return re;
	}
	
	public double[] getYPoint(){
		double[] re=new double[1];
		re[0]=y-r;
		re[1]=y+r;
		return re;
	}
	
	
	//获取覆盖面积
	public double getCoverage(){
		return 4*r*r;
	}
	
	
	
}
