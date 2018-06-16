package universe;

import general.vector;
import general.constant;

public class Astrobody {

	double m,r;   //m:1=1 Earth Mass; 1=1 km;
	double R[]=new double[3];
	double v[]=new double[3];
	double a[]=new double[3];
	
	double surfaceT;
	double surfaceg;
	
	double getsurfaceg(){
		return constant.G*m/r/r*1000;
	}
	
	double area(){
		return Math.PI*r*r;
	}
	double surface(){
		return 4*Math.PI*r*r;
	}
	
	
	
	
	
	

	
	public Astrobody(double m){
		this.m=m;
	}
	public Astrobody(double m,double a,double b,double c){
		this.m=m;
		this.R[0]=a;
		this.R[1]=b;
		this.R[2]=c;
	}
	public Astrobody(double m,double a,double b,double c,double d,double e,double f){
		this.m=m;
		this.R[0]=a;
		this.R[1]=b;
		this.R[2]=c;
		this.v[0]=d;
		this.v[1]=e;
		this.v[2]=f;
	}
	
	public static void main(String[] args) {
		Astrobody a=new Astrobody(1);
		Astrobody b=new Astrobody(333445);
		a.R[2]=-constant.AU;
		a.v[1]=29.783;
		for(int i=0;i<365*24;i++){
			//a.orbit(b, 3600);
			if(i%20==0)System.out.println(vector.magnitude(a.R));
			//System.out.println(a.a[2]);
			//System.out.println(a.v[2]);
		}
		
	}

}
