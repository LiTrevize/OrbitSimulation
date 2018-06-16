package general;



public class vector {

	public static double magnitude(double a[]){
		double m=0;
		for(int i=0;i<a.length;i++){
			m+=a[i]*a[i];
		}
		return Math.sqrt(m);
	}
	
	public static double magnitude(double a[],int n){
		int m=0;
		for(int i=0;i<n;i++){
			m+=a[i]*a[i];
		}
		return Math.sqrt(m);
	}
	
	public static double[] sum(double a[],double b[]){
		double c[]=new double[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i]+b[i];
		}
		return c;	
	}
	public static double[] sum(double a[],double b[],double c[]){
		double d[]=new double[a.length];
		for(int i=0;i<a.length;i++){
			d[i]=a[i]+b[i]+c[i];
		}
		return d;	
	}
	public static double[] minus(double a[],double b[]){
		double c[]=new double[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i]-b[i];
		}
		return c;	
	}
	
	public static double[] product(double a,double b[]){
		double c[]=new double[b.length];
		for(int i=0;i<b.length;i++){
			c[i]=a*b[i];
		}
		return c;
	}
	public static double[] divide(double b[],double a){
		double c[]=new double[b.length];
		for(int i=0;i<b.length;i++){
			c[i]=b[i]/a;
		}
		return c;
	}
	
	public static void main(String[] args) {
	
		int i;int j;
		double a[]={3,4,0};
		double b[]={3,10,6};
		double c[]={5,1,10};
		double d[]=new double[3];
		d=vector.sum(a,b,c);
		for(i=0;i<5;i++){
			for(j=i+1;j<6;j++){
				System.out.println(i+" "+j);
				
			}}
		
		
	}
}
