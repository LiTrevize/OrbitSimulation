package general;

public class Accy {

	public static double decione(double a){
		double n;
		n=((int)(a*100))%10;
		if(n>=5)
			return ((int)(a*10+1))*1.0/10;
		else
			return ((int)(a*10))*1.0/10;
	}
	public static double decitwo(double a){
		double n;
		n=((int)(a*1000))%10;
		if(n>=5)
			return ((int)(a*100+1))*1.0/100;
		else
			return ((int)(a*100))*1.0/100;
	}
	public static double decin(double a,double n){
		double i;
		i=((int)(a*Math.pow(10, n+1)))%10;
		if(i>=5)
			return ((int)(a*Math.pow(10, n)+1))*1.0/Math.pow(10, n);
		else
			return ((int)(a*Math.pow(10, n)))*1.0/Math.pow(10, n);
	}
	
	public static int getunit(double a){
		return ((int)a)%10;
	}
	public static int getten(double a){
		return ((int)a)/10%10;
	}
	public static int getndigit(double a,int n){
		return ((int)a)/(int)Math.pow(10, n-1)%10;
	}

}
