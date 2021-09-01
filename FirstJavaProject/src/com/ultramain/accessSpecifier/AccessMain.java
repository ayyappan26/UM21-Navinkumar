package com.ultramain.accessSpecifier;

public class AccessMain{
public static void main(String arg[]){
	Son myson=new Son();
	myson.eat();
	myson.inheritParentMethod();
	final int a=100;
	myson.printNumber(a);

	}
}
final class Dad{
	 public void eat(){
		System.out.println("Likes Vegetables");
	}
}
class Son{
	public void eat(){
	System.out.println("Likes Non-veg");
	}
	public void play(){
		System.out.println("Plays FootBall");
	}
	public  void inheritParentMethod(){
		Dad mydad=new Dad();
		mydad.eat();
	}
	public void printNumber(int a){
		System.out.println("the no is :"+a);
	}
}