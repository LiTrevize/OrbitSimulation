package universe;

import general.constant;
import general.vector;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++){
			System.out.println(i);
		}
		
		Star sun=new Star(1,constant.Sunradius);
		Planet earth=new Planet(1,6400,sun);
		sun.surfaceT=6000;
		earth.R[1]=constant.AU;
		earth.getT();
		System.out.println();
		System.out.println(earth.surfaceT);
	}

}
