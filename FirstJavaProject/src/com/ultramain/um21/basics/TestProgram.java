package com.ultramain.um21.basics;

import com.ultramain.vechicle.Bus;
public class TestProgram
{
	public static void main(String arg[])
	{
		System.out.println("Starting main");
		Car.greet("Welcome");
		TestProgram.doing();
		System.out.println("Ending main");
		Bus.bustype();
	}	
		public static void doing()
		{
			System.out.println("Starting Program");
			System.out.println("Doing");
			System.out.println("Ending Program");
		}
}
class Car
{
	public static void greet(String arg)
	{
		System.out.println("Starting Greeting");
		System.out.println(arg);
		System.out.println("Ending Greeting");
	}

	
	
}
