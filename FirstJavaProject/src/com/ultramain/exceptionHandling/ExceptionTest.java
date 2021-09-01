package com.ultramain.exceptionHandling;

import javax.annotation.processing.FilerException;
import javax.imageio.IIOException;

class Test{
	public void methodA(){
		try{
			int a=100/0;
		}catch(ArithmeticException e){
			System.out.println("Number can't be divide by ZERO");
		}
		methodB();
		
	}
	public void methodB(){
		methodC();try{
			String str=null;
			str.toString();
		}catch(NullPointerException ne){
			System.out.println("The String is null");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array size is only 3");
		}
	}
	public void methodC(){
		methodD();
	}
	public void methodD(){
		System.out.println("End of stack trace");
	}
}
public class ExceptionTest{
	public static void main(String arg[]){
		Test mytest=new Test();
		mytest.methodA();
	}
}