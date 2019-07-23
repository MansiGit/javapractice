package impl;

import interfaces.Shape;

public class Circle implements Shape {
	int r;
	
	@Override
	public double area() {
		
		return 3.14*r*r;
	}

	@Override
	public double perimeter() {
		return 3.14*r*2;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

}
