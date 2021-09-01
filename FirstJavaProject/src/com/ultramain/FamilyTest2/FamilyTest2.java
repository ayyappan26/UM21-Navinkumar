package com.ultramain.FamilyTest2;

public class FamilyTest2
{
	public static void main(String arg[])
	{
	   Yamaha ym=new RoyalEnfield();
	   //ym.type();
	   ym.mt();
	   ym.type();
	}
}
class Bike
{
	public void type()
	{
		System.out.println("Bikes are different types");
	}
}
class Yamaha extends Bike
{
	public void mt()
	{
		System.out.println("MT is a one of the model of yamaha Bike");
	}
	public void type()
	{
		System.out.println("Yamaha is one of the bike brand");
	}
}
class RoyalEnfield extends Yamaha
{
	public void gt()
	{
		System.out.println("GT is a one of RE's model");
	}
	public void type()
	{
		System.out.println("RE is one of the bike brand ");
	}
}