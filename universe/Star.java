package universe;

import general.constant;

public class Star extends Astrobody {

	
	
	public double radiation(){//per second
		return constant.sigma*this.surface()*Math.pow(this.surfaceT,4);
	}
	
	public Star(double m,double r) {
		super(m);
		this.r=r;
	}

	public static void main(String[] args) {
		
	}

}
