package universe;

import general.constant;
import general.vector;

public class Solsystem {

	Astrobody body[];//0 the mainstar
	
	public double mass(){
		int i;double m=0;
		for (i=0;i<body.length;i++){
			m+=body[i].m;
		}
		return m;
	}
	public double[] barycenter(){
		double m[]={0,0,0};
		int i;
		for (i=0;i<body.length;i++){
			m=vector.sum(m, vector.product(body[i].m, body[i].R));
		}
		m=vector.divide(m, mass());
		return m;
	}
	public double[] p(){
		int i;double p[]={0,0,0};
		for(i=0;i<body.length;i++){
			p=vector.sum(p,vector.product(body[i].m, body[i].v));
		}
		return p;
	}
	public double[] pv(){
		int i;
		
		return vector.divide(p(), mass());
	}
	
	public void orbit(double t){
		int i;int j;
		for(i=1;i<body.length;i++){
			body[i].a=vector.product(-constant.G*body[0].m*1/Math.pow(vector.magnitude(body[i].R), 3),body[i].R);
			body[i].v=vector.sum(body[i].v, vector.product(t, body[i].a));
			body[0].a=vector.product(-body[i].m/body[0].m,body[i].a);
			body[0].v=vector.sum(body[0].v, vector.product(t, body[0].a));
		}
		for(i=1;i<body.length-1;i++){
			for(j=i+1;j<body.length;j++){
				body[i].a=vector.product(-constant.G*body[j].m*1/Math.pow(vector.magnitude(vector.minus(body[i].R,body[j].R)), 3),vector.minus(body[i].R,body[j].R));
				body[i].v=vector.sum(body[i].v, vector.product(t, body[i].a));
				body[j].a=vector.product(-body[i].m/body[j].m,body[i].a);
				body[j].v=vector.sum(body[j].v, vector.product(t, body[j].a));
			}
		}
		for(i=1;i<body.length;i++){
			body[i].R=vector.sum(body[i].R, vector.product(t, body[i].v),vector.product(-t, body[0].v));
		}
	}
	
	public void move(double t){
		int i;int j;

		for(i=0;i<body.length-1;i++){
			for(j=i+1;j<body.length;j++){
				body[i].a=vector.product(-constant.G*body[j].m*1/Math.pow(vector.magnitude(vector.minus(body[i].R,body[j].R)), 3),vector.minus(body[i].R,body[j].R));
				body[i].v=vector.sum(body[i].v, vector.product(t, body[i].a));
				body[j].a=vector.product(-body[i].m/body[j].m,body[i].a);
				body[j].v=vector.sum(body[j].v, vector.product(t, body[j].a));
			}
		}
		for(i=0;i<body.length;i++){
			body[i].R=vector.sum(body[i].R, vector.product(t, body[i].v));
		}
	}
	
	public double getd(Astrobody a){
		return vector.magnitude(vector.minus(a.R, this.body[0].R));
	}
	
	public double getd(Astrobody a,int n){
		return vector.magnitude(vector.minus(a.R, this.body[n].R));
	}
	
	public void getT(Astrobody a){
		a.surfaceT=this.body[0].surfaceT*Math.sqrt(body[0].r/2/getd(a));
	}
	
	public void getT(Astrobody a,int n){
		a.surfaceT=0;
		for(int i=0;i<n;i++){
			a.surfaceT+=this.body[i].surfaceT*Math.sqrt(body[i].r/2/getd(a,i));
		}
	}
	
	public Solsystem(){
		
	}
	public Solsystem(Astrobody sys[]){
		this.body=sys;
	}
	
	public static void main(String[] args) {

		Astrobody a=new Astrobody(100,0,0,0,0,0,0);
		Astrobody b=new Astrobody(5,9,9,9,3,4,-9);
		Astrobody c=new Astrobody(1,4,4,4,3,-5,1);
		Solsystem sol=new Solsystem();
		
		sol.body=new Astrobody[3];
		sol.body[0]=a;sol.body[1]=b;sol.body[2]=c;
		int i;
		for (i=0;i<3;i++){
			System.out.println(sol.mass());
			//System.out.println(sol.pv()[i]);
			System.out.println(sol.p()[i]/sol.pv()[i]);
		}
		
		
	}

}
