package com.ultramain.vechicleTest;

import com.ultramain.vechicleTest.Car;

public class AudiCar extends Car
{
	public AudiCar()
	{
		//super("I Love Super Cars");
		System.out.println("It is Audi R8");
		System.out.println("------------------------------------------");
	}
	public void vechicleType(String brand,String model)
	{
		System.out.println("Brand of the Car   :"+brand);
		System.out.println("Model of the Car   :"+model);
	}
}