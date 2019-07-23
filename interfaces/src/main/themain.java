package main;

import interfaces.Shape;

import impl.*;

public class themain {
	static void calculate(Shape s) {
		double a = s.area();
		double cost = a * 1050 + s.perimeter() * 1500 + a * 1000 + a * 2500;
		if(s instanceof Rectange)
			System.out.println("It is a Rectangle.");
		else if (s instanceof Circle)
			System.out.println("It is a Cirlce.");
		else if (s instanceof Square)
			System.out.println("It is a Square.");
		
		System.out.println("Cost of " + s.getClass().getSimpleName()+ " is = "+cost); /*getClass().getName()*/

	}

	public static void main(String[] args) {
		Rectange r = new Rectange(2, 4);
		Circle c = new Circle(2);
		Square s = new Square(3);
		calculate(r);
		calculate(c);
		calculate(s);
		/*Shape t= new Rectange(2,4);
		calculate(t);*/
	}

}
