package com.ultramain.um21.laptop;

public class Laptop
{
	private String model;
	private String companyName;
	private String processorType;
	private String ramSize;
	private int purchaseYear;
	
	public Laptop()
	{
		
	}
	public Laptop(String model,String  companyName,String processorType,String ramSize,int purchaseYear )
	{
		this.model=model;
		this.companyName=companyName;
		this.processorType=processorType;
		this.ramSize=ramSize;
		this.purchaseYear=purchaseYear;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getcompanyName()
	{
		return companyName;
	}
	public void setcompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public String getprocessorType()
	{
		return processorType;
	}
	public void setprocessorType(String processorType)
	{
		this.processorType=processorType;
	}
	public String getramSize()
	{
		return ramSize;
	}
	public void setramSize(String ramSize)
	{
		this.ramSize=ramSize;
	}
	public int getpurchaseYear()
	{
		return purchaseYear;
	}
	public void setpurchaseYear(int purchaseYear)
	{
		this.purchaseYear=purchaseYear;
	}
	
}