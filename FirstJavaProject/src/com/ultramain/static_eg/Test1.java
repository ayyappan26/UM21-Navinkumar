package com.ultramain.static_eg;

import com.ultramain.bank.Bank;

public class Test1
{
	public static void main(String arg[]){
		Bank.bankName="ICICI";
		//Bank.setAccNumber(1223456);
		//Bank.setUserName("Mohan");
		//Bank.setDepositAmount(1223456,1098.54f);
		//Bank.viewBalance(1223456);
		
		Bank user1 = new Bank();
		Bank user2 = new Bank();
		
		user1.setAccNumber(123456);
		user1.setUserName("Mohan");
		user1.setDepositAmount(1020.5f);
		
		user2.setAccNumber(12336);
		user2.setUserName("Ranjith");
		user2.setDepositAmount(5000);
		
		user1.viewBalance();
		user2.viewBalance();
		
		
	}
}