package com.generation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float temp, temp1;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa el lado de un cuadro: ");
		temp = input.nextFloat();
		Square square = new Square("Cuadrado", temp);
		System.out.println(square.toString());
		
		System.out.println("Ingresa la base del triangulo: ");
		temp = input.nextFloat();
		System.out.println("Ingresa la altura del triangulo: ");
		temp1 = input.nextFloat();
		Triangle triangle = new Triangle("Triangulo", temp, temp1);
		System.out.println(triangle.toString());
		
		System.out.println("Ingresa el radio del circulo: ");
		temp = input.nextFloat();
		Circle circle = new Circle("Circulo", temp);
		System.out.println(circle.toString());
		
		input.close();
	}

}
