package com.exercise13oopstatic.app;

import com.exercise13oopstatic.model.Car;

public class CarApp {
	public static void main(String... args) {
		
		//Declaración de variables
		Car edgar = new Car("A1", 4);
		Car alex = new Car("A2", 4);
		Car ale = new Car("A3", 4);
		Car carlos = new Car("A4", 4);
		Car ary = new Car("A5", 4);
		Car paty = new Car("A6", 4);
		Car licha = new Car("A7", 4);
		Car jonas = new Car("A8", 4);
		Car david = new Car("A9", 4);
		Car marijo = new Car("A10", 4);
		
		edgar.setBrand("Volvo");
		alex.setBrand("Volvo");
		ale.setBrand("Volvo");
		carlos.setBrand("Honda");
		ary.setBrand("Honda");
		paty.setBrand("Honda");
		licha.setBrand("Honda");
		jonas.setBrand("Honda");
		david.setBrand("Honda");
		marijo.setBrand("Honda");
		
		System.out.println("Edgar " + edgar.toString());
		System.out.println("Alex " + alex.toString());
		System.out.println("Ale " + ale.toString());
		System.out.println("Carlos " + carlos.toString());
		System.out.println("Ary " + ary.toString());
		System.out.println("Licha " + licha.toString());
		System.out.println("Jonas " + jonas.toString());
		System.out.println("David " + david.toString());
		System.out.println("Marijo " + marijo.toString());
		
		alex.CarIsCoupe(true);
		
		System.out.println("Alex " + alex.toString());
	}
}
