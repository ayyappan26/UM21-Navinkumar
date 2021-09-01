package com.ultramain.employee;

import java.util.Scanner;

public class EmployeeInput {
	private static Scanner scanner;
	public EmployeeInput(){
		
	}
	public static Scanner getscannerInstance(){
		if(scanner==null){
			scanner=new Scanner(System.in);
		}
		return scanner;
	}

}
