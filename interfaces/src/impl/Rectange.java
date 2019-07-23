package impl;

import interfaces.Shape;

public class Rectange implements Shape {
int length,bredth;
	@Override
	public double area() {
		return length*bredth;
	}

	@Override
	public double perimeter() {
		return 2*(length+bredth);
	}

	public Rectange(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

}
