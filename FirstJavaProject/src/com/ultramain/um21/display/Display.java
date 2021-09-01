package com.ultramain.um21.display;

import com.ultramain.um21.laptop.Laptop;

public class Display
{
	public void displayDetails(Laptop laptop)
	{
	System.out.println("COMPANY NAME        :"+laptop.getcompanyName());
	System.out.println("MODEL               :"+laptop.getModel());
	System.out.println("RAM SIZE            :"+laptop.getramSize());
	System.out.println("PROCESSOR TYPE      :"+laptop.getprocessorType());
	System.out.println("PURCHASE YEAR       :"+laptop.getpurchaseYear());
	System.out.println("---------------------------------------------------");
		
	}
	
}
