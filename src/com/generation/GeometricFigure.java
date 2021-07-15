package com.generation;

public abstract class GeometricFigure {
	protected String name;

	protected GeometricFigure(String name) {
		this.name = name;
	}
	
	protected abstract float getArea();
	
}
