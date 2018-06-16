package universe;

import general.constant;
import general.vector;

public class Planet extends Astrobody {

	double axis[]=new double[3];
	float rotateperiod;  //  T/s
	
	public void getT(){
		//surfaceT=Math.sqrt(mainstar.r/2/vector.magnitude(this.R))*mainstar.surfaceT;
	}
	public double getobliquity(){
		return Math.asin(axis[2]/vector.magnitude(axis));
	}

	public Planet(double m,double r) {
		super(m);
		this.r=r;
	}
	public Planet(double m,double r,Astrobody a) {
		super(m);
		this.r=r;
		//mainstar=a;
	}

	public static void main(String[] args) {
		

	}

}
