package impl;

import interfaces.Shape;

public class Square implements Shape {
	int l;
	public Square(int l) {
		super();
		this.l = l;
	}

	@Override
	public double area() {
		return l*l;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*l;
	}

}
