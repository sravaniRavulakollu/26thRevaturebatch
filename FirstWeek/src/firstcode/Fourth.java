package firstcode;

import java.lang.Math;

public class Fourth {
	//Right angle Triangle finding hypothenuse
	static double hypo(double a,double b)
	{
		double c=(float)Math.pow((a*a+b*b), 0.5);
		return c;
	}

	public static void main(String[] args) {
		
		System.out.println((int)hypo(5,6));
		System.out.println(hypo(34.5,23.6));

	}

}
