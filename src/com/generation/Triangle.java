package com.generation;

public class Triangle extends GeometricFigure{
	
	private float base;
	private float height;
	
	public Triangle(String name, float base, float height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public float getArea() {
		return (this.base * this.height) / 2;
	}
	
	@Override
	public String toString() {
		return "Soy un "+ this.name + ", mi area es: "+ this.getArea();
	}
}
