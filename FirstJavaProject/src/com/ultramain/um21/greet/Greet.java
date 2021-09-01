package com.ultramain.um21.greet;

public class Greet
{
	int time;
	public Greet()
	{
		time=21;
	}
	public Greet(int time)
	{
		this.time = time;
	}
	public void greetingMessage()
	{
		greetMorning();
		greetEvening();
	}
	public void greetMorning()
	{
	System.out.println("   GOOD MORNING  ");	
	}
	public void greetEvening()
	{
		System.out.println("   GOOD EVENING   ");
		greetNight();
	}
	public void greetNight()
	{
	if (time>20)
		{
		System.out.println("   GOOD NIGHT   ");
		}
	}
	
}