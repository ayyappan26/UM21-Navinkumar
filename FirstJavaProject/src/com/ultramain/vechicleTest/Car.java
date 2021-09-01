package com.ultramain.vechicleTest;

import com.ultramain.vechicleTest.VechicleHead;

public class Car extends VechicleHead
{
	public Car()

	{
		this("Car is a Vechicle");
		System.out.println("This is car Class");
	}
	public Car(String msg)
	{
		System.out.println("Instruction  :"+msg);
	}
	public void vechicleType(String type)
	{
		System.out.println("Type of the vechicle   :"+type);
	}
}