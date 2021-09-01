package com.ultramain.fibonnaci;
import java.util.Scanner;
public class Fibonnaci{
	 static void prg(int N){
		 int n1=0, n2=1;
		 int count=0;
		 while(count<N){
			 System.out.print(n1+" ");
			 int n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 count=count+1;
		 }
		 
	 }
	 public static void main(String arg[]){
		 //int N=10;
		 System.out.println("Enter the number");
		 Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 prg(num);
	 }
}