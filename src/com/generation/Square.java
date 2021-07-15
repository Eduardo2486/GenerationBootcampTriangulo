package com.generation;

public class Square extends GeometricFigure {
	private float side;

	public Square(String name,float side) {
		super(name);
		this.side = side;
	}
	
	@Override
	public float getArea() {
		return this.side * this.side;
	}
	
	@Override
	public String toString() {
		return "Soy un "+ this.name + ", mi area es: "+ this.getArea();
	}
	
}
