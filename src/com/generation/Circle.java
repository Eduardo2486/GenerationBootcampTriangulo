package com.generation;

public class Circle extends GeometricFigure {
	private double radio;

	public Circle(String name, double radio) {
		super(name);
		this.radio = radio;
	}

	@Override
	public float getArea() {
		double areaDouble = Math.PI * Math.pow(this.radio, 2);
		float area = (float) areaDouble;
		return area;
	}
	
	@Override
	public String toString() {
		return "Soy un "+ this.name + ", mi area es: "+ this.getArea();
	}
	
}
