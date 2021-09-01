package com.ultramain.FamilyTest3;

public class FamilyTest3{
	public static void main(String arg[]){
		Car mycar=new Car();
		mycar.getdetail();
		
	}
}
class Vechicle{
	public void horn(){
		System.out.println("Vechicle has horn");
	}
}
class Car extends Vechicle{
	public void drive(){
		System.out.println("The car has electronic steering");
	}
	public void getdetail(){
		drive();
		horn();
		System.out.println("Car wheels   :"+getWheelcount());
	}
	public int getWheelcount(){
		return new Wheel().wheelCount("car");
	}
}
class Wheel{
	public int wheelCount(String type){
		if(type.equals("car")){
			return 4;
		}
		return 0;
	}
}