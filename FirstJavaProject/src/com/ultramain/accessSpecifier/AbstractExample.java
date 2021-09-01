package com.ultramain.accessSpecifier;

public class AbstractExample{
	public static void main(String arg[]){
		GrandMom grandma=new GrandMom();
		grandma.eat();
		grandma.play();
		}
}
abstract class GrandDad{
	public void eat(){
		System.out.println("Likes Veg");
	}
	abstract void play();
	
}
class GrandMom extends GrandDad{
	public void play(){
		System.out.println("Play FootBall");
	}
	public void eat(){
		super.eat();
		System.out.println("Likes Fruits");
	}
}